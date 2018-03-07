package com.kalix.art.system.dict.biz;

import com.kalix.framework.core.api.extend.IUserDefaultRole;

/**
 * Created by sunlf on 2018-03-07.
 * 根据企业用户类型添加默认的企业角色
 */
public class CompanyDefaultRoleImpl implements IUserDefaultRole {
    public String getRoleName() {
        return "企业角色";
    }
}
