package com.kalix.art.candidate.entities;

import com.kalix.framework.core.api.annotation.KalixCascade;
import com.kalix.framework.core.api.annotation.TableCascade;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @类描述：专业课程管理
 * @创建人： hqj
 * @创建时间：2017-11-28
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
//todo 修改模型定义
@Entity
@Table(name = "art_major_course")
public class MajorCourseBean extends PersistentEntity {
    private String name;    //课程名称
    private Long orgid;     //所在机构(学院专业)id
    private String comment; //课程描述

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrgid() {
        return orgid;
    }

    public void setOrgid(Long orgid) {
        this.orgid = orgid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
