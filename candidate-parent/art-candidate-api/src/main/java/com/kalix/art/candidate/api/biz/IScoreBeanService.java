package com.kalix.art.candidate.api.biz;

import com.kalix.art.candidate.entities.ScoreBean;
import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.JsonStatus;

/**
 * @类描述：应用服务接口.
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface IScoreBeanService extends IBizService<ScoreBean> {

    JsonData getEntitiesByFK(long fk, Integer page, Integer limit, String jsonStr, String sort);

    JsonStatus saveEntityByFK(long fk, ScoreBean entity);

    JsonStatus updateEntityByFK(long fk, ScoreBean entity);

    JsonStatus deleteEntityByFK(long fk, long entityId);
}
