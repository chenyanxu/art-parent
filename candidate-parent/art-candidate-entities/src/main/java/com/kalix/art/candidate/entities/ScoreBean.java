package com.kalix.art.candidate.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 成绩实体类
 * @author hqj <br/>
 *         date:2017-12-05
 * @version 1.0.0
 */
@Entity
@Table(name = "art_score")
public class ScoreBean extends PersistentEntity {
    private Long studentId;       //学生id
    private Long majorCourseId;   //专业课程id
    private Double score;         //所学课程的分数

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getMajorCourseId() {
        return majorCourseId;
    }

    public void setMajorCourseId(Long majorCourseId) {
        this.majorCourseId = majorCourseId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
