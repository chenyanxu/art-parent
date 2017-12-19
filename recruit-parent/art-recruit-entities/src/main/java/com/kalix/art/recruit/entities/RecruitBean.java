package com.kalix.art.recruit.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @类描述： 企业招聘实体类
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "art_recruit")
@ApiModel("招聘<br>RecruitBean")
public class RecruitBean extends PersistentEntity {
    @ApiModelProperty("企业组织机构代码")
    private String companyCode;       //企业组织机构代码
    @ApiModelProperty("企业名称")
    private String companyName;       //企业名称
    @ApiModelProperty("邮箱")
    private String companyEmail;      //邮箱
    @ApiModelProperty("固定电话")
    private String companyPhone;      //固定电话
    @ApiModelProperty("手机")
    private String companyMobile;     //手机
    @ApiModelProperty("企业性质")
    private Integer companyNature;    //企业性质，字典
    @ApiModelProperty("企业规模")
    private String companyScale;      //企业规模
    @ApiModelProperty("企业行业")
    private Integer companyIndustry;  //企业行业，字典
    @ApiModelProperty("企业年限")
    private String companyLife;       //企业年限
    @ApiModelProperty("企业所在地区")
    private String companyRegion;     //地区
    @ApiModelProperty("企业所在城市")
    private String companyCity;       //城市
    @ApiModelProperty("企业详细地址")
    private String companyAddress;    //企业详细地址
    @ApiModelProperty("发布时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date publishDate;         //发布时间
    @ApiModelProperty("工作地区")
    private String region;            //工作地区
    @ApiModelProperty("工作城市")
    private String city;              //工作城市
    @ApiModelProperty("职位描述")
    private String position;          //职位描述
    @ApiModelProperty("岗位要求")
    private String positionRequires;  //岗位要求
    @ApiModelProperty("岗位个数")
    private Integer jobNumbers;       //岗位个数
    @ApiModelProperty("学历")
    private String education;         //学历
    @ApiModelProperty("职能类别")
    private Long functionCategoryId;  //职能类别，对象字典
    @ApiModelProperty("薪资")
    private Integer salary;           //薪资
    @ApiModelProperty("应用技术名称")
    private String appliedTechnology; //应用技术名称
    @ApiModelProperty("个人要求")
    private String personRequires;    //个人要求，字典【个人要求】多个
    @ApiModelProperty("工作类型")
    private Integer jobType;          //工作类型

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyMobile() {
        return companyMobile;
    }

    public void setCompanyMobile(String companyMobile) {
        this.companyMobile = companyMobile;
    }

    public Integer getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(Integer companyNature) {
        this.companyNature = companyNature;
    }

    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale;
    }

    public Integer getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(Integer companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getCompanyLife() {
        return companyLife;
    }

    public void setCompanyLife(String companyLife) {
        this.companyLife = companyLife;
    }

    public String getCompanyRegion() {
        return companyRegion;
    }

    public void setCompanyRegion(String companyRegion) {
        this.companyRegion = companyRegion;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionRequires() {
        return positionRequires;
    }

    public void setPositionRequires(String positionRequires) {
        this.positionRequires = positionRequires;
    }

    public Integer getJobNumbers() {
        return jobNumbers;
    }

    public void setJobNumbers(Integer jobNumbers) {
        this.jobNumbers = jobNumbers;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Long getFunctionCategoryId() {
        return functionCategoryId;
    }

    public void setFunctionCategoryId(Long functionCategoryId) {
        this.functionCategoryId = functionCategoryId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getAppliedTechnology() {
        return appliedTechnology;
    }

    public void setAppliedTechnology(String appliedTechnology) {
        this.appliedTechnology = appliedTechnology;
    }

    public String getPersonRequires() {
        return personRequires;
    }

    public void setPersonRequires(String personRequires) {
        this.personRequires = personRequires;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }
}
