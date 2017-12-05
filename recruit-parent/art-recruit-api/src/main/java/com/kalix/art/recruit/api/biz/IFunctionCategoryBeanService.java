package com.kalix.art.recruit.api.biz;

import com.kalix.art.recruit.dto.model.FunctionCategoryDTO;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.biz.ITreeBizService;

/**
 * 职能类别管理服务接口
 * @author hqj date:2017-12-04
 * @version 1.0.0
 */
public interface IFunctionCategoryBeanService extends IBizService<FunctionCategoryBean>, ITreeBizService {
}
