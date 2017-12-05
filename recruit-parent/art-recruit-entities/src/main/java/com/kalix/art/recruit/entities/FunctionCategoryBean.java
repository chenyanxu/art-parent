package com.kalix.art.recruit.entities;

import com.kalix.framework.core.api.persistence.BaseTreeEntity;
import io.swagger.annotations.ApiModel;

import javax.persistence.*;

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
@Inheritance(strategy = InheritanceType.JOINED)
public class FunctionCategoryBean extends BaseTreeEntity {
}
