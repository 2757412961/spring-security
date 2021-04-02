package com.zjh.springsecurity.permission.init;

import com.zjh.springsecurity.permission.dao.UserInfoDao;
import com.zjh.springsecurity.permission.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author: zjh
 * @date : 2021/4/1 21:56
 * @Email : 2757412961@qq.com
 * @update:
 */

@Service
public class DataInit {

    @Autowired
    private UserInfoDao userInfoDao;

    @PostConstruct
    public void dataInit() {
        UserInfo admin = new UserInfo();
        admin.setUsername("admin");
        admin.setPassword("123");
        admin.setRole(UserInfo.Role.admin);
        userInfoDao.save(admin);

        UserInfo normal = new UserInfo();
        normal.setUsername("user");
        admin.setPassword("123");
        admin.setRole(UserInfo.Role.normal);
        userInfoDao.save(normal);
    }

}
