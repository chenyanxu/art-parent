package com.kalix.art.candidate.dto.model;

import com.kalix.framework.core.api.web.model.BaseDTO;

/**
 * 成绩信息模型类
 * @author hqj date:2017-12-21
 * @version 1.0.0
 */
public class ScoreDTO extends BaseDTO {
    private Long studentId;         //学生id
    private String code;            //学生学号
    private String name;            //学生姓名
    private Long majorId;           //专业id
    private String majorName;       //专业名称
    private Long majorCourseId;     //专业课程id
    private String majorCourseName; //专业课程名称
    private Double score;           //所学课程的分数

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Long getMajorCourseId() {
        return majorCourseId;
    }

    public void setMajorCourseId(Long majorCourseId) {
        this.majorCourseId = majorCourseId;
    }

    public String getMajorCourseName() {
        return majorCourseName;
    }

    public void setMajorCourseName(String majorCourseName) {
        this.majorCourseName = majorCourseName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
