package com.kalix.art.candidate.biz;

import com.kalix.art.candidate.api.biz.ICandidateBeanService;
import com.kalix.art.candidate.api.dao.ICandidateBeanDao;
import com.kalix.art.candidate.entities.CandidateBean;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.general.person.api.biz.IStudentBeanService;
import com.kalix.general.person.entities.StudentBean;
import org.apache.commons.lang.StringUtils;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
public class CandidateBeanServiceImpl extends ShiroGenericBizServiceImpl<ICandidateBeanDao, CandidateBean> implements ICandidateBeanService {
    private IStudentBeanService studentBeanService;

    @Override
    public JsonData getAllEntityByQuery(Integer page, Integer limit, String jsonStr, String sort) {
        if (StringUtils.isBlank(sort)) {
            sort = "[{'property': 'creationDate', 'direction': 'DESC'}]";
        }
        JsonData jsonData = super.getAllEntityByQuery(page, limit, jsonStr, sort);
        for (int i = 0; i < jsonData.getData().size(); i++) {
            CandidateBean candidateBean = (CandidateBean) jsonData.getData().get(i);
            StudentBean studentBean = studentBeanService.getEntity(candidateBean.getStudentId());
            candidateBean.setMajorId(studentBean.getMajorId());
            candidateBean.setMajorName(studentBean.getMajorName());
            candidateBean.setClassId(studentBean.getClassId());
            candidateBean.setClassName(studentBean.getClassName());
            candidateBean.setCode(studentBean.getCode());
            candidateBean.setName(studentBean.getName());
        }
        return jsonData;
    }

    @Override
    public CandidateBean getEntity(long entityId) {
        CandidateBean candidateBean = super.getEntity(entityId);
        StudentBean studentBean = studentBeanService.getEntity(candidateBean.getStudentId());
        candidateBean.setMajorId(studentBean.getMajorId());
        candidateBean.setMajorName(studentBean.getMajorName());
        candidateBean.setClassId(studentBean.getClassId());
        candidateBean.setClassName(studentBean.getClassName());
        candidateBean.setCode(studentBean.getCode());
        candidateBean.setName(studentBean.getName());
        return candidateBean;
    }

    public void setStudentBeanService(IStudentBeanService studentBeanService) {
        this.studentBeanService = studentBeanService;
    }
}
