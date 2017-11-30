package com.kalix.art.candidate.biz;

import com.kalix.admin.core.api.dao.IOrganizationBeanDao;
import com.kalix.admin.core.api.dao.IUserBeanDao;
import com.kalix.admin.core.entities.OrganizationBean;
import com.kalix.art.candidate.api.biz.IMajorCourseBeanService;
import com.kalix.art.candidate.api.dao.IMajorCourseBeanDao;
import com.kalix.art.candidate.entities.MajorCourseBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.SerializeUtil;
import com.kalix.framework.core.util.StringUtils;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class MajorCourseBeanServiceImpl extends ShiroGenericBizServiceImpl<IMajorCourseBeanDao, MajorCourseBean> implements IMajorCourseBeanService {
    private JsonStatus jsonStatus = new JsonStatus();
    private IMajorCourseBeanDao majorCourseBeanDao;
    private IOrganizationBeanDao orgDao;

    public void setMajorCourseBeanDao(IMajorCourseBeanDao majorCourseBeanDao) {
        this.majorCourseBeanDao = majorCourseBeanDao;
    }

    public void setOrgDao(IOrganizationBeanDao orgDao) {
        this.orgDao = orgDao;
    }

    public MajorCourseBeanServiceImpl() {
        super.init(MajorCourseBean.class.getName());
    }

    @Override
    public JsonData getEntitiesByFK(long orgId, Integer page, Integer limit, String jsonStr, String sort) {
        return this.dao.findByOrgId(orgId, page, limit, jsonStr, sort);
    }

    @Override
    @Transactional
    public JsonStatus saveEntityByFK(long fk, MajorCourseBean entity) {
        if (fk == entity.getOrgid()) {
            return super.saveEntity(entity);
        }
        else {
            jsonStatus.setSuccess(false);
            jsonStatus.setMsg("选择的专业不符合要求,添加专业课程失败!");
            return jsonStatus;
        }
    }

    @Override
    @Transactional
    public JsonStatus updateEntityByFK(long fk, MajorCourseBean entity) {
        if (fk == entity.getOrgid()) {
            Map<String, String> params = new HashMap<String, String>();
            params.put("id", String.valueOf(entity.getId()));
            params.put("orgid", String.valueOf(fk));
            String jsonStr = SerializeUtil.serializeJson(params);
            JsonData jsonData = super.getAllEntityforReport(jsonStr);
            if (jsonData.getTotalCount() > 0) {
                jsonStatus = super.updateEntity(entity);
            }
            else {
                jsonStatus.setSuccess(false);
                jsonStatus.setMsg("未查询到该实体,更新失败!");
            }
        }
        else {
            jsonStatus = super.updateEntity(entity);
        }
        return jsonStatus;
    }

    @Override
    @Transactional
    public JsonStatus deleteEntityByFK(long fk, long entityId) {
        return super.deleteEntity(entityId);
    }

    @Override
    public boolean isDelete(Long entityId, JsonStatus status) {
        return true;
    }
}
