package com.zjh.springsecurity.permission.service.impl;

import com.zjh.springsecurity.permission.dao.UserInfoDao;
import com.zjh.springsecurity.permission.entity.UserInfo;
import com.zjh.springsecurity.permission.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: zjh
 * @date : 2021/4/1 21:46
 * @Email : 2757412961@qq.com
 * @update:
 */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByusername(username);
    }
}
