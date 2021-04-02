package com.zjh.springsecurity.permission.service;

import com.zjh.springsecurity.permission.entity.UserInfo;

/**
 * @author: zjh
 * @date : 2021/4/1 21:45
 * @Email : 2757412961@qq.com
 * @update:
 */

public interface UserInfoService  {

    public UserInfo findByUsername(String username);

}
