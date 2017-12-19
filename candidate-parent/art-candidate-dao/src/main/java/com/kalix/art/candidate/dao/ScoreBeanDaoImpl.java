package com.kalix.art.candidate.dao;

import com.kalix.art.candidate.api.dao.IScoreBeanDao;
import com.kalix.art.candidate.entities.ScoreBean;
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
public class ScoreBeanDaoImpl extends GenericDao<ScoreBean, Long> implements IScoreBeanDao {
    @Override
    @PersistenceContext(unitName = "art-candidate-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
