package com.kalix.art.system.dict.biz;

import com.kalix.framework.core.api.extend.IUserDefaultRole;

/**
 * Created by sunlf on 2018-03-07.
 * 根据学生用户类型添加默认的学生角色
 */
public class StudentDefaultRoleImpl implements IUserDefaultRole {
    public String getRoleName() {
        return "学生角色";
    }
}
