package com.kalix.art.recruit.api.dao;

import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.api.dao.IGenericDao;

import java.util.List;

/**
 * 职能类别管理DAO接口
 * @author hqj date:2017-11-30
 * @version 1.0.0
 */
public interface IFunctionCategoryBeanDao extends IGenericDao<FunctionCategoryBean, Long> {

    /**
     * 查询指定代码的职能类别（不包括指定的id）
     *
     * @param id
     * @param code
     * @return
     */
    List<FunctionCategoryBean> findByCode(Long id, String code);

    /**
     * 查询指定代码的职能类别
     *
     * @param code
     * @return
     */
    List<FunctionCategoryBean> findByCode(String code);

    /**
     * 查询指定父代码下指定名称的职能类别（不包括指定的id）
     *
     * @param parentId
     * @param id
     * @param name
     * @return
     */
    List<FunctionCategoryBean> findByName(Long parentId, Long id, String name);

    /**
     * 查询指定父代码的职能类别
     *
     * @param parentId
     * @return
     */
    List<FunctionCategoryBean> findByParentId(Long parentId);

    /**
     * 查询所有id集合中的职能类别
     *
     * @param id
     * @return
     */
    List<FunctionCategoryBean> findById(List<Long> id);
}
