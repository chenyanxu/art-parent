package com.kalix.art.recruit.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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
    private Long enterpriseId;           //企业id
    @ApiModelProperty("企业组织机构代码")
    private String enterpriseCode;       //企业组织机构代码
    @ApiModelProperty("企业名称")
    private String enterpriseName;       //企业名称
    @ApiModelProperty("邮箱")
    private String enterpriseEmail;      //邮箱
    @ApiModelProperty("固定电话")
    private String enterprisePhone;      //固定电话
    @ApiModelProperty("手机")
    private String enterpriseMobile;     //手机
    @ApiModelProperty("企业性质")
    private Integer enterpriseNature;    //企业性质，字典[企业性质]
    @ApiModelProperty("企业规模")
    private String enterpriseScale;      //企业规模
    @ApiModelProperty("企业行业")
    private Integer enterpriseIndustry;  //企业行业，字典[企业行业]
    @ApiModelProperty("企业年限")
    private String enterpriseLife;       //企业年限
    @ApiModelProperty("企业所在省份")
    private Integer enterpriseRegion;    //省份（地区），字典[省份]
    @ApiModelProperty("企业所在城市")
    private String enterpriseCity;       //城市
    @ApiModelProperty("企业详细地址")
    private String enterpriseAddress;    //企业详细地址
    @ApiModelProperty("发布时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date publishDate;         //发布时间
    @ApiModelProperty("工作省份")
    private Integer region;           //工作省份（地区），字典[省份]
    @ApiModelProperty("工作城市")
    private String city;              //工作城市
    @ApiModelProperty("岗位名称")
    private String position;          //岗位名称（职位描述）
    @ApiModelProperty("岗位要求")
    private String positionRequires;  //岗位要求
    @ApiModelProperty("岗位所需软件")
    private String requireSofts;      //岗位所需软件
    @ApiModelProperty("岗位个数")
    private Integer jobNumbers;       //岗位个数
    @ApiModelProperty("学历")
    private Integer education;        //学历，字典[学历]
    @ApiModelProperty("职能类别")
    private Long functionCategoryId;  //职能类别，对象字典
    @ApiModelProperty("实习薪资")
    private Integer probationSalary;  //实习薪资,字典[月薪]
    @ApiModelProperty("转正薪资")
    private Integer salary;           //转正薪资,字典[月薪]
    @ApiModelProperty("应用技术名称")
    private String appliedTechnology; //应用技术名称
    @ApiModelProperty("个人要求")
    private String personRequires;    //个人要求，字典[个人要求]多个
    @ApiModelProperty("工作类型")
    private Integer jobType;          //工作类型，字典[工作类型]

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseMobile() {
        return enterpriseMobile;
    }

    public void setEnterpriseMobile(String enterpriseMobile) {
        this.enterpriseMobile = enterpriseMobile;
    }

    public Integer getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(Integer enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale;
    }

    public Integer getEnterpriseIndustry() {
        return enterpriseIndustry;
    }

    public void setEnterpriseIndustry(Integer enterpriseIndustry) {
        this.enterpriseIndustry = enterpriseIndustry;
    }

    public String getEnterpriseLife() {
        return enterpriseLife;
    }

    public void setEnterpriseLife(String enterpriseLife) {
        this.enterpriseLife = enterpriseLife;
    }

    public Integer getEnterpriseRegion() {
        return enterpriseRegion;
    }

    public void setEnterpriseRegion(Integer enterpriseRegion) {
        this.enterpriseRegion = enterpriseRegion;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
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

    public String getRequireSofts() {
        return requireSofts;
    }

    public void setRequireSofts(String requireSofts) {
        this.requireSofts = requireSofts;
    }

    public Integer getJobNumbers() {
        return jobNumbers;
    }

    public void setJobNumbers(Integer jobNumbers) {
        this.jobNumbers = jobNumbers;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Long getFunctionCategoryId() {
        return functionCategoryId;
    }

    public void setFunctionCategoryId(Long functionCategoryId) {
        this.functionCategoryId = functionCategoryId;
    }

    public Integer getProbationSalary() {
        return probationSalary;
    }

    public void setProbationSalary(Integer probationSalary) {
        this.probationSalary = probationSalary;
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
