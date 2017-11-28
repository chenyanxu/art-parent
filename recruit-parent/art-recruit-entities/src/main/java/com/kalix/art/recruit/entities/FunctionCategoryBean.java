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
 * @类描述： 职能类别实体类
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
@Entity
@Table(name = "art_function_category")
@ApiModel("职能类别<br>FunctionCategoryBean")
public class FunctionCategoryBean extends PersistentEntity {
    private String name;     //职能类别名称
    @Column(unique = true)
    private String code;     //职能类别代码
    private Long isLeaf;     //是否是叶子节点
    private Long parentId;   //父职能类别id

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Long isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
