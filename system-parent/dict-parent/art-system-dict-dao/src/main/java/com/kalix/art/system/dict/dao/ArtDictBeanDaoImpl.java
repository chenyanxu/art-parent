package com.kalix.art.system.dict.dao;

import com.kalix.art.system.dict.api.dao.IArtDictBeanDao;
import com.kalix.art.system.dict.entities.ArtDictBean;
import com.kalix.framework.core.impl.dao.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ArtDictBeanDaoImpl extends GenericDao<ArtDictBean, Long> implements IArtDictBeanDao {
    @Override
    @PersistenceContext(unitName = "art-system-dict-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
