package com.kalix.art.recruit.biz;

import com.kalix.art.recruit.api.biz.IFunctionCategoryBeanService;
import com.kalix.art.recruit.api.dao.IFunctionCategoryBeanDao;
import com.kalix.art.recruit.dto.model.FunctionCategoryDTO;
import com.kalix.art.recruit.entities.FunctionCategoryBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.biz.CodeUtil;
import com.kalix.framework.core.impl.biz.Compare;
import com.kalix.framework.core.impl.biz.ShiroGenericBizServiceImpl;
import com.kalix.framework.core.impl.biz.TreeShiroGenericBizServiceImpl;
import com.kalix.framework.core.util.Assert;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 职能类别管理服务实现
 *
 * @author hqj date:2017-12-01
 * @version 1.0.0
 */
public class FunctionCategoryBeanServiceImpl extends TreeShiroGenericBizServiceImpl<IFunctionCategoryBeanDao, FunctionCategoryBean> implements IFunctionCategoryBeanService {

    private static final String FUNCTION_NAME = "职能类别";

    public FunctionCategoryBeanServiceImpl() {
        super.init(FunctionCategoryBean.class.getName());
        super.setFunctionName(FUNCTION_NAME);
    }
}