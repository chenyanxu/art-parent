package com.kalix.art.candidate.dao;

import com.kalix.art.candidate.api.biz.CommonMethod;
import com.kalix.art.candidate.api.dao.IMajorCourseBeanDao;
import com.kalix.art.candidate.entities.MajorCourseBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.dao.GenericDao;
import org.apache.commons.lang.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class MajorCourseBeanDaoImpl extends GenericDao<MajorCourseBean, Long> implements IMajorCourseBeanDao {
    @Override
    @PersistenceContext(unitName = "art-candidate-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<MajorCourseBean> findByOrgId(Long orgId) {
        String hql = "select t from MajorCourseBean t where t.orgid = ?1";
        return (List<MajorCourseBean>) this.find(hql, orgId);
    }

    @Override
    public JsonData findByOrgId(Long orgId, Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = new JsonData();
        /*String hql = "select t from MajorCourseBean t where t.orgid = ?1";
        //hql += CommonMethod.createWhereCondition(jsonStr, sort);
        List list = this.findbyPage(hql, page-1, limit, orgId);*/
        String sql = "select t.* from (select a.* from " + super.getTableName() + " a where a.orgid = ?1) t";
        sql += CommonMethod.createWhereCondition(jsonStr, sort);
        jsonData = this.findByNativeSql(sql, page, limit, MajorCourseBean.class, orgId);
        return jsonData;
    }
}
