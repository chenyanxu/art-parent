package com.kalix.art.candidate.api.dao;

import com.kalix.art.candidate.entities.ScoreBean;
import com.kalix.framework.core.api.dao.IGenericDao;
import com.kalix.framework.core.api.persistence.JsonData;

/**
 * @类描述：DAO接口
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface IScoreBeanDao extends IGenericDao<ScoreBean, Long> {

    JsonData findByFK(Long fk, Integer page, Integer limit, String jsonStr, String sort);

    ScoreBean getEntityByUnique(Long studentId, Long majorCourseId);
}
