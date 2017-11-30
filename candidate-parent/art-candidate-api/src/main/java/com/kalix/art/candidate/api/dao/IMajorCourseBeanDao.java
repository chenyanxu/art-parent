package com.kalix.art.candidate.api.dao;

import com.kalix.art.candidate.entities.MajorCourseBean;
import com.kalix.framework.core.api.dao.IGenericDao;
import com.kalix.framework.core.api.persistence.JsonData;

import java.util.List;

/**
 * @类描述：DAO接口
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public interface IMajorCourseBeanDao extends IGenericDao<MajorCourseBean, Long> {
    //在此添加新的DAO方法

    /**
     * 通过机构id查找专业课程信息
     *
     * @param orgId
     * @return
     */
    List<MajorCourseBean> findByOrgId(Long orgId);

    /**
     * 分页查询，通过机构id查找专业课程信息
     * @param orgId
     * @param page
     * @param limit
     * @param sort
     * @return
     */
    JsonData findByOrgId(Long orgId, Integer page, Integer limit, String jsonStr, String sort);
}
