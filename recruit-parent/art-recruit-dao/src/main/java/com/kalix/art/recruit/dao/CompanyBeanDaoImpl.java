package com.kalix.art.recruit.dao;

import com.kalix.art.recruit.api.dao.ICompanyBeanDao;
import com.kalix.art.recruit.dto.model.CompanyDTO;
import com.kalix.art.recruit.entities.CompanyBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.dao.CommonMethod;
import com.kalix.framework.core.impl.dao.GenericDao;
import org.apache.commons.lang.StringUtils;

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

    @Override
    public JsonData getAllRelations(Integer page, Integer limit, String jsonStr, String sort) {
        JsonData jsonData = new JsonData();
        String sql = "select t.* from " +
                " (select b.id, a.id as userId, a.code, a.name, a.email, a.phone, a.mobile, " +
                " b.nature, b.scale, b.industry, b.life, b.region, b.city, b.address, b.version_, b.creationDate, b.updateDate " +
                " from sys_user a left join " + super.getTableName() + " b on a.id = b.userid " +
                " where a.usertype = 3) t";
        sql += CommonMethod.createWhereCondition(jsonStr, sort);
        jsonData = this.findByNativeSql(sql, page, limit, CompanyDTO.class);
        return jsonData;
    }
}
