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
    private String studentNo;           //学号
    @ApiModelProperty("姓名")
    private String name;                //姓名
    @ApiModelProperty("身份证号")
    private String identificationCard;  //身份证号
    @ApiModelProperty("性别")
    private Integer sex;                //性别，字典
    @ApiModelProperty("出生日期")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;              //出生日期
    @ApiModelProperty("民族")
    private String nation;              //民族
    @ApiModelProperty("政治面貌")
    private String politicalStatus;     //政治面貌
    @ApiModelProperty("入党团时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date joinPartyDate;         //入党团时间
    @ApiModelProperty("地区")
    private String region;              //地区
    @ApiModelProperty("城市")
    private String city;                //城市
    @ApiModelProperty("学历")
    private String education;           //学历
    @ApiModelProperty("薪资")
    private Integer salary;             //薪资
    @ApiModelProperty("个人特点")
    private String skills;              //个人特点，字典【个人要求】多个
    @ApiModelProperty("职业规划、目标")
    private String careerGoal;          //职业规划、目标
    @ApiModelProperty("联系电话")
    private String phone;               //联系电话
    @ApiModelProperty("联系地址")
    private String address;             //联系地址
    @ApiModelProperty("专业")
    private Long majorId;               //专业id
    @Transient
    private String majorName;           //专业名称
    @ApiModelProperty("期望行业")
    private Integer expectingIndustry;  //期望行业，字典【企业行业】
}
