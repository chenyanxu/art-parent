package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.ICompanyBeanService;
import com.kalix.art.recruit.api.dao.ICompanyBeanDao;
import com.kalix.art.recruit.entities.CompanyBean;
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
    /*@Override
    public void beforeSaveEntity(RecruitBean entity, JsonStatus status) {
        String userName = shiroService.getCurrentUserRealName();
        Assert.notNull(userName, "用户名不能为空.");
        if (StringUtils.isNotEmpty(userName)) {
            entity.setPublishDate(new Date());
        }
    }*/
}
