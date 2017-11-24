package com.kalix.art.system.dict.biz;

import com.kalix.art.system.dict.api.biz.IArtDictBeanService;
import com.kalix.art.system.dict.api.dao.IArtDictBeanDao;
import com.kalix.art.system.dict.entities.ArtDictBean;
import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.system.BaseDictServiceImpl;

public class ArtDictBeanServiceImpl extends BaseDictServiceImpl<IArtDictBeanDao, ArtDictBean> implements IArtDictBeanService {
    @Override
    public JsonStatus saveEntity(ArtDictBean entity) {
        Integer maxValue = dao.getFieldMaxValue("value", "type='" + entity.getType() + "'");

        maxValue = maxValue + 1;

        entity.setValue(maxValue);

        return super.saveEntity(entity);
    }
}
