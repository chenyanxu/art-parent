package com.kalix.art.enterprise.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2018/7/25.
 */
@Entity
@Table(name = "art_enterprise")
@ApiModel("企业<br>EnterpriseBean")
public class EnterpriseBean extends PersistentEntity {
    @Column(unique = true)
    private String code;        // 企业组织机构代码
    private String name;        // 企业名称
    private String email;       // 邮箱
    private String phone;       // 固定电话
    private String mobile;      // 手机
    @ApiModelProperty("企业性质")
    private Integer nature;     // 企业性质，字典[企业性质]
    @ApiModelProperty("企业规模")
    private String scale;       // 企业规模
    @ApiModelProperty("企业行业")
    private Integer industry;   // 企业行业，字典[企业行业]
    @ApiModelProperty("企业年限")
    private String life;        // 企业年限
    @ApiModelProperty("省份")
    private Integer region;     // 省份（地区），字典[省份]
    @ApiModelProperty("城市")
    private String city;        // 城市
    @ApiModelProperty("企业详细地址")
    private String address;     // 企业详细地址

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
}
