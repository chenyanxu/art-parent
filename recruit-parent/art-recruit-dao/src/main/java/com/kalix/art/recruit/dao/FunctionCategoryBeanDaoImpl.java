package com.kalix.art.recruit.dao;

import com.kalix.art.recruit.api.dao.IFunctionCategoryBeanDao;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.impl.dao.BaseTreeEntityDao;
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
public class FunctionCategoryBeanDaoImpl extends BaseTreeEntityDao<FunctionCategoryBean, Long> implements IFunctionCategoryBeanDao {

    @Override
    @PersistenceContext(unitName = "art-recruit-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
