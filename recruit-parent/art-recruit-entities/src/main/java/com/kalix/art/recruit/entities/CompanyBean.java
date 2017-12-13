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
 * @类描述： 企业实体类
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "art_company")
@ApiModel("企业<br>CompanyBean")
public class CompanyBean extends PersistentEntity {
    @ApiModelProperty("企业组织机构代码")
    @Column(unique = true)
    private String code;           //企业组织机构代码
    @ApiModelProperty("企业名称")
    private String name;           //企业名称
    @ApiModelProperty("企业性质")
    private Integer nature;        //企业性质，字典
    @ApiModelProperty("企业规模")
    private String scale;          //企业规模
    @ApiModelProperty("企业行业")
    private Integer industry;      //企业行业，字典
    @ApiModelProperty("企业年限")
    private String life;           //企业年限
    @ApiModelProperty("地区")
    private String region;         //地区
    @ApiModelProperty("城市")
    private String city;           //城市

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
}
