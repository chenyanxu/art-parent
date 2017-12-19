package com.kalix.art.candidate.biz;

import com.kalix.art.candidate.api.biz.IScoreBeanService;
import com.kalix.art.candidate.api.dao.IScoreBeanDao;
import com.kalix.art.candidate.entities.ScoreBean;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class ScoreBeanServiceImpl extends ShiroGenericBizServiceImpl<IScoreBeanDao, ScoreBean> implements IScoreBeanService {

    public ScoreBeanServiceImpl() {
        super.init(ScoreBean.class.getName());
    }
}
