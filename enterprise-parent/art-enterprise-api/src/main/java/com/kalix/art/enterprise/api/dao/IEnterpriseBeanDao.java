package com.kalix.art.enterprise.api.dao;

import com.kalix.art.enterprise.entities.EnterpriseBean;
import com.kalix.framework.core.api.dao.IGenericDao;

/**
 * @类描述：DAO接口
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface IEnterpriseBeanDao extends IGenericDao<EnterpriseBean, Long> {
    /**
     * 关联查询
     * @param page
     * @param limit
     * @param jsonStr
     * @param sort
     * @return
     */
    //JsonData getAllRelations(Integer page, Integer limit, String jsonStr, String sort);
}
