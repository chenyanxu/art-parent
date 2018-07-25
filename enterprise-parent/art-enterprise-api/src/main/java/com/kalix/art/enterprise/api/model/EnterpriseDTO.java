package com.kalix.art.enterprise.api.model;

import com.kalix.framework.core.api.web.model.BaseDTO;

/**
 * 企业信息模型类
 * @author hqj date:2017-12-13
 * @version 1.0.0
 */
public class EnterpriseDTO extends BaseDTO {
    private Long userId;           //与用户关联id
    private String code;      //企业组织机构代码
    private String name;      //企业名称
    private String email;     //邮箱
    private String phone;     //固定电话
    private String mobile;    //手机
    private Integer nature;        //企业性质，字典
    private String scale;          //企业规模
    private Integer industry;      //企业行业，字典
    private String life;           //企业年限
    private Integer region;        //省份（地区）
    private String city;           //城市
    private String address;        //企业详细地址
    private Long version_;         //版本控制
    private Long createById;       //创建者id

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getVersion_() {
        return version_;
    }

    public void setVersion_(Long version_) {
        this.version_ = version_;
    }

    public Long getCreateById() {
        return createById;
    }

    public void setCreateById(Long createById) {
        this.createById = createById;
    }
}
