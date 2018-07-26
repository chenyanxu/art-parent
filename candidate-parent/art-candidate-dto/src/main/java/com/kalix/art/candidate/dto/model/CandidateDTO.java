package com.kalix.art.candidate.dto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.web.model.BaseDTO;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/26.
 */
public class CandidateDTO extends BaseDTO {
    private Long studentId;            //学生id
    private Integer region;            //工作省份（地区），字典[省份]
    private String city;               //工作城市
    private Integer expectingIndustry; //期望行业，字典[企业行业]
    private Integer jobType;           //工作类型，字典[工作类型]
    private String position;           //期望岗位
    private String learningSofts;      //所学软件
    private Integer education;         //学历，字典[学历]
    private Integer salary;            //薪资，字典[月薪]
    private String skills;             //个人特点，字典[个人要求]多个
    private String careerGoal;         //职业规划、目标

    private Long majorId;              // 专业id
    private String majorName;          // 专业名称
    private Long classId;              // 班级id
    private String className;          // 班级名称
    private String instructor;         // 辅导员
    private String code;               // 学号
    private String name;               // 姓名
    private Integer sex;               // 性别，字典[性别]
    private String email;              // 邮箱
    private String phone;              // 固定电话
    private String mobile;             // 手机
    private String identificationCard; // 身份证号
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;             // 出生日期
    private String nation;             // 民族
    private String placeOfOrigin;      // 籍贯
    private String politicalStatus;    // 政治面貌
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date joinPartyDate;        // 入党团时间
    private String address;            // 联系地址
    private String postalcode;         // 邮政编码
    private String homePhone;          // 家庭联系电话
    private Integer province;          // 生源省份，字典[省份]
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy", timezone = "GMT+8")
    private Date entranceYear;         // 入学年份
    private String trainingLevel;      // 学生培养层次
    private String period;             // 学习年限

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

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public Date getJoinPartyDate() {
        return joinPartyDate;
    }

    public void setJoinPartyDate(Date joinPartyDate) {
        this.joinPartyDate = joinPartyDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Date getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(Date entranceYear) {
        this.entranceYear = entranceYear;
    }

    public String getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
