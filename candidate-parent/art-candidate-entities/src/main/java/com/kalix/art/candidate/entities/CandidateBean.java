package com.kalix.art.candidate.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * @类描述： 学生应聘实体类
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "art_candidate")
@ApiModel("应聘<br>CandidateBean")
public class CandidateBean extends PersistentEntity {
    private Long studentId;            //学生id
    @ApiModelProperty("工作省份")
    private Integer region;            //工作省份（地区），字典[省份]
    @ApiModelProperty("工作城市")
    private String city;               //工作城市
    @ApiModelProperty("期望行业")
    private Integer expectingIndustry; //期望行业，字典[企业行业]
    @ApiModelProperty("工作类型")
    private Integer jobType;            //工作类型，字典[工作类型]
    @ApiModelProperty("期望岗位")
    private String position;            //期望岗位
    @ApiModelProperty("所学软件")
    private String learningSofts;       //所学软件
    @ApiModelProperty("学历")
    private Integer education;           //学历，字典[学历]
    @ApiModelProperty("薪资")
    private Integer salary;             //薪资，字典[月薪]
    @ApiModelProperty("个人特点")
    private String skills;              //个人特点，字典[个人要求]多个
    @ApiModelProperty("职业规划、目标")
    private String careerGoal;          //职业规划、目标

    @Transient
    private Long majorId;              // 专业id
    @Transient
    private String majorName;          // 专业名称
    @Transient
    private Long classId;              // 班级id
    @Transient
    private String className;          // 班级名称
    @Transient
    private String code;               // 学号
    @Transient
    private String name;               // 姓名

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getExpectingIndustry() {
        return expectingIndustry;
    }

    public void setExpectingIndustry(Integer expectingIndustry) {
        this.expectingIndustry = expectingIndustry;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLearningSofts() {
        return learningSofts;
    }

    public void setLearningSofts(String learningSofts) {
        this.learningSofts = learningSofts;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCareerGoal() {
        return careerGoal;
    }

    public void setCareerGoal(String careerGoal) {
        this.careerGoal = careerGoal;
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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
}
