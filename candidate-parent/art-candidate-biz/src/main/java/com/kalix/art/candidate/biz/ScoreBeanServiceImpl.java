package com.kalix.art.candidate.biz;

import com.kalix.art.candidate.api.biz.IScoreBeanService;
import com.kalix.art.candidate.api.dao.IScoreBeanDao;
import com.kalix.art.candidate.entities.ScoreBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.SerializeUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class ScoreBeanServiceImpl extends ShiroGenericBizServiceImpl<IScoreBeanDao, ScoreBean> implements IScoreBeanService {
    private JsonStatus jsonStatus = new JsonStatus();

    public ScoreBeanServiceImpl() {
        super.init(ScoreBean.class.getName());
    }

    @Override
    public JsonData getEntitiesByFK(long fk, Integer page, Integer limit, String jsonStr, String sort) {
        return this.dao.findByFK(fk, page, limit, jsonStr, sort);
    }

    @Override
    public JsonStatus saveEntityByFK(long fk, ScoreBean entity) {
        ScoreBean scoreBean = this.dao.getEntityByUnique(entity.getStudentId(), entity.getMajorCourseId());
        if (scoreBean != null) {
            jsonStatus.setSuccess(false);
            jsonStatus.setMsg("学生成绩已经存在,添加数据失败!");
            return jsonStatus;
        }
        if (fk == entity.getStudentId().longValue()) {
            return super.saveEntity(entity);
        }
        else {
            jsonStatus.setSuccess(false);
            jsonStatus.setMsg("添加数据失败!");
            return jsonStatus;
        }
    }

    @Override
    public JsonStatus updateEntityByFK(long fk, ScoreBean entity) {
        if (fk == entity.getStudentId().longValue()) {
            ScoreBean scoreBean = super.getEntity(entity.getId());
            if (scoreBean != null) {
                jsonStatus = super.updateEntity(entity);
            }
            else {
                jsonStatus.setSuccess(false);
                jsonStatus.setMsg("未查询到该实体,更新失败!");
            }
        }
        else {
            jsonStatus.setSuccess(false);
            jsonStatus.setMsg("修改数据失败!");
            return jsonStatus;
        }
        return jsonStatus;
    }

    @Override
    public JsonStatus deleteEntityByFK(long fk, long entityId) {
        return super.deleteEntity(entityId);
    }
}
