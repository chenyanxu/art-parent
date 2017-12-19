package com.kalix.art.candidate.biz;

import com.kalix.art.candidate.api.biz.ICandidateBeanService;
import com.kalix.art.candidate.api.dao.ICandidateBeanDao;
import com.kalix.art.candidate.entities.CandidateBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.Assert;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CandidateBeanServiceImpl extends ShiroGenericBizServiceImpl<ICandidateBeanDao, CandidateBean> implements ICandidateBeanService {
    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        if (StringUtils.isBlank(sort)) {
            sort = "[{'property': 'creationDate', 'direction': 'DESC'}]";
        }
        return super.getAllEntityByQuery(page, limit, jsonStr, sort);
    }
}
