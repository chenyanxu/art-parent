package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.ICompanyBeanService;
import com.kalix.art.recruit.api.dao.ICompanyBeanDao;
import com.kalix.art.recruit.entities.CompanyBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CompanyBeanServiceImpl extends ShiroGenericBizServiceImpl<ICompanyBeanDao, CompanyBean> implements ICompanyBeanService {

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        return dao.getAllRelations(page, limit, jsonStr, sort);
    }
}
