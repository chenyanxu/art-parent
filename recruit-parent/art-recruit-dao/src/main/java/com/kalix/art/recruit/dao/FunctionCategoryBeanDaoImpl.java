package com.kalix.art.recruit.dao;

import com.kalix.art.recruit.api.dao.IFunctionCategoryBeanDao;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * 职能类别管理DAO实现
 * @author hqj date:2017-12-01
 * @version 1.0.0
 */
public class FunctionCategoryBeanDaoImpl extends GenericDao<FunctionCategoryBean, Long> implements IFunctionCategoryBeanDao {

    @Override
    @PersistenceContext(unitName = "art-recruit-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }

    @Override
    public List<FunctionCategoryBean> findByCode(Long id, String code) {
        return (List<FunctionCategoryBean>) this.find("select ob from FunctionCategoryBean ob where ob.id <> ?1 and ob.code = ?2 order by ob.code", id, code);
    }

    @Override
    public List<FunctionCategoryBean> findByCode(String code) {
        return (List<FunctionCategoryBean>) this.find("select ob from FunctionCategoryBean ob where ob.code like ?1 order by ob.code", code + "%");
    }

    @Override
    public List<FunctionCategoryBean> findByName(Long parentId, Long id, String name) {
        return (List<FunctionCategoryBean>) this.find("select ob from FunctionCategoryBean ob where ob.parentId = ?1 and ob.id <> ?2 and ob.name = ?3 order by ob.code", parentId, id, name);
    }

    @Override
    public List<FunctionCategoryBean> findByParentId(Long parentId) {
        return (List<FunctionCategoryBean>) this.find("select ob from FunctionCategoryBean ob where ob.parentId = ?1 order by ob.code", parentId);
    }

    @Override
    public List<FunctionCategoryBean> findById(List<Long> id) {
        if (id != null && !id.isEmpty()) {
            return (List<FunctionCategoryBean>) this.find("select ob from FunctionCategoryBean ob where ob.id in (?1) order by ob.code", id);
        } else {
            return new ArrayList<>();
        }
    }
}
