package com.kalix.art.candidate.entities;

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
@Table(name = "art_candidate")
@ApiModel("招聘<br>CandidateBean")
public class CandidateBean extends PersistentEntity {
    @ApiModelProperty("标题")
    private String title;   //标题
    @ApiModelProperty("内容")
    private String content; //内容
    @ApiModelProperty(hidden = true)
    private String publishPeople;//发布人
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(hidden = true)
    private Date publishDate;//发布时间

    public String getTitle() {
        return title;
    }

    public void setTitle(String text) {
        this.title = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublishPeople() {
        return publishPeople;
    }

    public void setPublishPeople(String publishPeople) {
        this.publishPeople = publishPeople;
    }

    @ApiModelProperty(hidden = true)
    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "CandidateBean{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", publishPeople='" + publishPeople + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
