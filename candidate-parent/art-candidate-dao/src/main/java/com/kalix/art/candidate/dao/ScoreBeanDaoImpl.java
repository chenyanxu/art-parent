package com.kalix.art.candidate.dao;

import com.kalix.art.candidate.api.dao.IScoreBeanDao;
import com.kalix.art.candidate.dto.model.ScoreDTO;
import com.kalix.art.candidate.entities.ScoreBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.dao.CommonMethod;
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

    @Override
    public JsonData findByFK(Long fk, Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = new JsonData();
        String sql = "select t.* from " +
                " (select a.id, a.creationDate, a.updateDate, a.version_, a.studentId, c.code, c.name, " +
                " b.majorId, d.name as majorName, a.majorCourseId, e.name as majorCourseName, a.score " +
                " from " + super.getTableName() + " a " +
                " left join research_person_student b on a.studentId = b.id " +
                " left join sys_user c on b.userId = c.id " +
                " left join sys_organization d on b.majorId = d.id " +
                " left join art_major_course e on a.majorCourseId = e.id " +
                " where a.studentid = ?1) t";
        sql += CommonMethod.createWhereCondition(jsonStr, sort);
        jsonData = this.findByNativeSql(sql, page, limit, ScoreDTO.class, fk);
        return jsonData;
    }

    @Override
    public ScoreBean getEntityByUnique(Long studentId, Long majorCourseId) {
        String hql = "select s from ScoreBean s where s.studentId = ?1 and s.majorCourseId = ?2";
        return this.findUnique(hql, studentId, majorCourseId);
    }
}
