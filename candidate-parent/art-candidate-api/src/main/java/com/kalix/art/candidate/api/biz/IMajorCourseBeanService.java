package com.kalix.art.candidate.api.biz;

import com.kalix.art.candidate.entities.MajorCourseBean;
import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.JsonStatus;

import java.util.List;

/**
 * @类描述：应用服务接口.
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface IMajorCourseBeanService extends IBizService<MajorCourseBean> {
    //在此添加新的业务方法
    JsonData getEntitiesByFK(long fk, Integer page, Integer limit, String jsonStr, String sort);

    JsonStatus saveEntityByFK(long fk, MajorCourseBean entity);

    JsonStatus updateEntityByFK(long fk, MajorCourseBean entity);

    JsonStatus deleteEntityByFK(long fk, long entityId);
}
