package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.IRecruitBeanService;
import com.kalix.art.recruit.api.dao.IRecruitBeanDao;
import com.kalix.art.recruit.entities.RecruitBean;
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
public class RecruitBeanServiceImpl extends ShiroGenericBizServiceImpl<IRecruitBeanDao, RecruitBean> implements IRecruitBeanService {
    /*@Override
    public void beforeSaveEntity(RecruitBean entity, JsonStatus status) {
        String userName = shiroService.getCurrentUserRealName();
        Assert.notNull(userName, "用户名不能为空.");
        if (StringUtils.isNotEmpty(userName)) {
            entity.setPublishDate(new Date());
        }
    }*/
}
