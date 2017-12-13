package com.kalix.art.recruit.dao;

import com.kalix.art.recruit.api.dao.ICompanyBeanDao;
import com.kalix.art.recruit.entities.CompanyBean;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
//@Transactional
public class CompanyBeanDaoImpl extends GenericDao<CompanyBean, Long> implements ICompanyBeanDao {
    @Override
    @PersistenceContext(unitName = "art-recruit-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
