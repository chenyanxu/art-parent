package com.kalix.art.recruit.api.dao;

import com.kalix.art.recruit.entities.CompanyBean;
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
public interface ICompanyBeanDao extends IGenericDao<CompanyBean, Long> {
    //在此添加新的DAO方法
    JsonData getAllRelations(Integer page, Integer limit, String jsonStr, String sort);
}
