package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.IFunctionCategoryBeanService;
import com.kalix.art.recruit.api.dao.IFunctionCategoryBeanDao;
import com.kalix.art.recruit.dto.model.FunctionCategoryDTO;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.CodeUtil;
import com.kalix.framework.core.impl.biz.Compare;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.Assert;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 职能类别管理服务实现
 *
 * @author hqj date:2017-12-01
 * @version 1.0.0
 */
public class FunctionCategoryBeanServiceImpl extends ShiroGenericBizServiceImpl<IFunctionCategoryBeanDao, FunctionCategoryBean> implements IFunctionCategoryBeanService {

    private static final String FUNCTION_NAME = "职能类别";

    public FunctionCategoryBeanServiceImpl() {
        super.init(FunctionCategoryBean.class.getName());
    }

    @Override
    public void beforeSaveEntity(FunctionCategoryBean entity, JsonStatus status) {
        Assert.notNull(entity, "实体不能为空.");

        String userName = shiroService.getCurrentUserLoginName();
        if (userName != null) {
            entity.setCreateBy(userName);
            entity.setUpdateBy(userName);
        }
    }

    @Override
    @Transactional
    public void afterSaveEntity(FunctionCategoryBean entity, JsonStatus status) {
        Assert.notNull(entity, "实体不能为空.");

        if (entity.getParentId() != -1) {
            FunctionCategoryBean parentFunctionCategoryBean = dao.get(entity.getParentId());
            if (parentFunctionCategoryBean != null && parentFunctionCategoryBean.getIsLeaf() == 1) {
                parentFunctionCategoryBean.setIsLeaf(0L);
                dao.save(parentFunctionCategoryBean);
            }
        }
    }

    @Override
    public boolean isUpdate(FunctionCategoryBean entity, JsonStatus status) {
        Assert.notNull(entity, "实体不能为空.");

        // 校验职能类别名称
        List<FunctionCategoryBean> beans = dao.findByName(entity.getParentId(), entity.getId(), entity.getName());
        if (beans != null && beans.size() > 0) {
            status.setFailure(true);
            status.setMsg(FUNCTION_NAME + "名称已经存在！");
            return false;
        }
        // 校验职能类别代码
        /*beans = dao.findByCode(entity.getId(), entity.getCode());
        if (beans != null && beans.size() > 0) {
            status.setFailure(true);
            status.setMsg(FUNCTION_NAME + "代码已经存在！");
            return false;
        }*/
        return true;
    }

    @Override
    public boolean isSave(FunctionCategoryBean entity, JsonStatus status) {
        Assert.notNull(entity, "实体不能为空.");

        // 校验职能类别名称
        List<FunctionCategoryBean> beans = dao.findByName(entity.getParentId(), 0L, entity.getName());
        if (beans != null && beans.size() > 0) {
            status.setSuccess(false);
            status.setMsg(FUNCTION_NAME + "名称已经存在！");
            return false;
        }
        // 校验职能类别代码
        /*beans = dao.findByCode(0L, entity.getCode());
        if (beans != null && beans.size() > 0) {
            status.setSuccess(false);
            status.setMsg(FUNCTION_NAME + "代码已经存在！");
            return false;
        }*/
        String code = CodeUtil.createCode(IFunctionCategoryBeanDao.class, entity.getParentId());
        if (code.isEmpty()) {
            status.setSuccess(false);
            status.setMsg(FUNCTION_NAME + "代码生成错误！");
            return false;
        }
        else {
            entity.setCode(code);
        }
        return true;
    }

    @Override
    public boolean isDelete(Long entityId, JsonStatus status) {
        if (dao.get(entityId) == null) {
            status.setFailure(true);
            status.setMsg(FUNCTION_NAME + "已经被删除！");
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void doDelete(long id, JsonStatus jsonStatus) {
        try {
            FunctionCategoryBean bean = dao.get(id);
            if (bean != null) {
                // 删除子节点
                removeChildren(id);
                // 删除自己
                dao.remove(id);
                // 更新父节点
                updateParent(bean.getParentId());

                jsonStatus.setSuccess(true);
                jsonStatus.setMsg("删除" + FUNCTION_NAME + "成功！");
            } else {
                jsonStatus.setFailure(true);
                jsonStatus.setMsg(FUNCTION_NAME + "不存在或已被删除！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsonStatus.setFailure(true);
            jsonStatus.setMsg(FUNCTION_NAME + "删除失败！");
        }
    }

    /**
     * 如果父节点下再没有子节点,将更新父节点状态
     *
     * @param parentId
     */
    @Transactional
    public void updateParent(Long parentId) {
        if (parentId != -1) {
            // 获取父节点
            FunctionCategoryBean parentBean = dao.get(parentId);
            if (parentBean != null) {
                // 获取父节点下的所有子节点
                List<FunctionCategoryBean> children = dao.findByParentId(parentId);
                if (children == null || children.isEmpty()) {
                    parentBean.setIsLeaf(1L);
                    dao.save(parentBean);
                }
            }
        }
    }

    @Transactional
    public void removeChildren(Long id) {
        List<FunctionCategoryBean> children = dao.findByParentId(id);
        if (children != null && !children.isEmpty()) {
            children.stream()
                    .forEach(n -> {
                        removeChildren(n.getId());
                        this.deleteEntity(n.getId());
                        //dao.remove(n.getId());
                    });
        }
    }

    @Override
    public void beforeUpdateEntity(FunctionCategoryBean entity, JsonStatus status) {
        super.beforeUpdateEntity(entity, status);
    }

    @Override
    @Transactional
    public JsonStatus updateEntity(FunctionCategoryBean entity) {
        JsonStatus jsonStatus = new JsonStatus();
        try {
            if (isUpdate(entity, jsonStatus)) {
                FunctionCategoryBean oldFunctionCategory = dao.get(entity.getId());
                oldFunctionCategory.setName(entity.getName());
                /*oldFunctionCategory.setCode(entity.getCode());*/
                oldFunctionCategory.setUpdateBy(shiroService.getCurrentUserLoginName());
                dao.save(oldFunctionCategory);
                jsonStatus.setSuccess(true);
                jsonStatus.setMsg("更新" + FUNCTION_NAME + "成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsonStatus.setFailure(true);
            jsonStatus.setMsg("更新" + FUNCTION_NAME + "失败！");
        }
        return jsonStatus;
    }

    /**
     * 查询全部 职务类别
     * @return
     */
    @Override
    public FunctionCategoryDTO getAllFunctionCategory() {

        List<FunctionCategoryBean> functionCategorys = dao.getAll().stream()
                .sorted(Compare.<FunctionCategoryBean>compare()
                        .thenComparing((a, b) -> a.getCode().compareTo(b.getCode())))
                .collect(Collectors.toList());

        return generateRoot(functionCategorys, -1L);
    }

    @Override
    public FunctionCategoryDTO getFunctionCategoryDTO(Long id) {

        FunctionCategoryBean bean = dao.get(id);
        if (bean != null) {
            return generateRoot(dao.findByCode(bean.getCode()), id);
        }
        else {
            return null;
        }
    }

    private FunctionCategoryDTO generateRoot(List<FunctionCategoryBean> beans, Long id) {

        FunctionCategoryDTO root = new FunctionCategoryDTO();
        Mapper mapper = new DozerBeanMapper();
        //String parentName = "根课程类型";
        String parentName = "根";

        for (FunctionCategoryBean bean : beans) {
            if (bean.getId() == id) {
                root = mapper.map(bean, FunctionCategoryDTO.class);
                root.setText(bean.getName());
                parentName = bean.getName();
                break;
            }
        }

        root.setId(id);

        if (beans != null && beans.size() > 0) {
            List<FunctionCategoryBean> rootElements = getRootElements(beans, id);
            if (rootElements != null && rootElements.size() > 0) {
                for (FunctionCategoryBean rootElement : rootElements) {
                    FunctionCategoryDTO functionCategoryDTO = mapper.map(rootElement, FunctionCategoryDTO.class);
                    functionCategoryDTO.setLeaf(rootElement.getIsLeaf() != 0);
                    functionCategoryDTO.setParentName(parentName);
                    functionCategoryDTO.setText(rootElement.getName());
                    getChilden(functionCategoryDTO, beans, mapper, true);
                    root.getChildren().add(functionCategoryDTO);
                }
            }
        }

        return root;
    }

    /**
     * 获得所有根节点
     *
     * @param elements
     * @return
     */
    private List<FunctionCategoryBean> getRootElements(List<FunctionCategoryBean> elements, Long id) {
        return elements.stream().filter(n->n.getParentId().equals(id))
                .collect(Collectors.toList());
    }

    /**
     * 递归函数加载子课程类型
     *
     * @param root
     * @param elements
     */
    private void getChilden(FunctionCategoryDTO root, List<FunctionCategoryBean> elements, Mapper mapper, boolean isRecursion) {

        List<FunctionCategoryDTO> children = new ArrayList<>();
        elements.stream().filter(n -> root.getId() != -1 && (root.getId() == n.getParentId()))
                .forEach(n -> {
                    FunctionCategoryDTO functionCategoryDTO = mapper.map(n, FunctionCategoryDTO.class);
                    functionCategoryDTO.setLeaf(n.getIsLeaf() != 0);
                    functionCategoryDTO.setParentName(root.getName());
                    functionCategoryDTO.setText(n.getName());
                    children.add(functionCategoryDTO);

                    if (isRecursion && n.getIsLeaf() == 0) {
                        getChilden(functionCategoryDTO, elements, mapper, isRecursion);
                    }
                });
        root.setChildren(children);
    }
}