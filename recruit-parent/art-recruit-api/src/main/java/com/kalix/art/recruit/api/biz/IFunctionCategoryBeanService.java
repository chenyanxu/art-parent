package com.kalix.art.recruit.api.biz;

import com.kalix.art.recruit.dto.model.FunctionCategoryDTO;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.api.biz.IBizService;

/**
 * 课程类型管理服务接口
 * @author hqj date:2017-3-14
 * @version 1.0.0
 */
public interface IFunctionCategoryBeanService extends IBizService<FunctionCategoryBean> {

    FunctionCategoryDTO getAllFunctionCategory();

    FunctionCategoryDTO getFunctionCategoryDTO(Long id);
}
