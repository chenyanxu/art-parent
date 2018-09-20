package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.IRecruitBeanService;
import com.kalix.art.recruit.api.dao.IRecruitBeanDao;
import com.kalix.art.recruit.entities.RecruitBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.StringUtils;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class RecruitBeanServiceImpl extends ShiroGenericBizServiceImpl<IRecruitBeanDao, RecruitBean> implements IRecruitBeanService {
    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        if (StringUtils.isEmpty(sort)) {
            sort = "[{'property': 'creationDate', 'direction': 'DESC'}]";
        }
        return super.getAllEntityByQuery(page, limit, jsonStr, sort);
    }
}
