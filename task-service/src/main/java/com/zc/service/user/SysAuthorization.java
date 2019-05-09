package com.zc.service.user;

import com.zc.api.model.common.UserSecurityEntity;

/**
 * Created by denghy on 2018/8/31.
 */
public interface SysAuthorization {
    UserSecurityEntity authorizationUserById(String id,String url);
}