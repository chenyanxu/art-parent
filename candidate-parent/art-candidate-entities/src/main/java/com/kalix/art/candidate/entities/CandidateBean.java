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
    @ApiModelProperty("学号")
    private String code;                //学号
    @ApiModelProperty("姓名")
    private String name;                //姓名
    @ApiModelProperty("工作地区")
    private String region;              //工作地区
    @ApiModelProperty("工作城市")
    private String city;                //工作城市
    @ApiModelProperty("学历")
    private String education;           //学历
    @ApiModelProperty("薪资")
    private Integer salary;             //薪资
    @ApiModelProperty("个人特点")
    private String skills;              //个人特点，字典【个人要求】多个
    @ApiModelProperty("职业规划、目标")
    private String careerGoal;          //职业规划、目标
    @ApiModelProperty("期望行业")
    private Integer expectingIndustry;  //期望行业，字典【企业行业】

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
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

    public Integer getExpectingIndustry() {
        return expectingIndustry;
    }

    public void setExpectingIndustry(Integer expectingIndustry) {
        this.expectingIndustry = expectingIndustry;
    }
}
