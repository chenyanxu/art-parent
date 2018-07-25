package com.kalix.art.enterprise.biz;

import com.kalix.art.enterprise.api.biz.IEnterpriseBeanService;
import com.kalix.art.enterprise.api.dao.IEnterpriseBeanDao;
import com.kalix.art.enterprise.entities.EnterpriseBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class EnterpriseBeanServiceImpl extends ShiroGenericBizServiceImpl<IEnterpriseBeanDao, EnterpriseBean> implements IEnterpriseBeanService {

    /*@Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        // 通过dao层sql实现查找数据，无法增加数据权限，为解决此问题需要将dao层实现代码直接在biz里实现
        // return dao.getAllRelations(page, limit, jsonStr, sort);
        JsonData jsonData = new JsonData();
        // 通过用户表和企业表，关联查询企业信息（用户表左关联企业表，即用户注册即存在企业信息）
        String sql = "select s.* from " +
                " (select b.id, a.id as userId, a.code, a.name, a.email, a.phone, a.mobile, " +
                " b.nature, b.scale, b.industry, b.life, b.region, b.city, b.address, b.version_, b.creationDate, b.updateDate, " +
                " a.id as createbyid " +
                " from sys_user a left join " + this.dao.getTableName() + " b on a.id = b.userid " +
                " where a.usertype = 3) s";
        // 增加数据权限
        sql = super.addDataAuthNativeSql(sql, "s", false);
        sql = "select t.* from (" + sql + ") t";
        sql += CommonMethod.createWhereCondition(jsonStr, sort);
        jsonData = this.dao.findByNativeSql(sql, page, limit, CompanyDTO.class);
        return jsonData;
    }*/
}
