package com.zjh.springsecurity.permission.dao;

import com.zjh.springsecurity.permission.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zjh
 * @date : 2021/4/1 21:44
 * @Email : 2757412961@qq.com
 * @update:
 */

public interface UserInfoDao extends JpaRepository<UserInfo, Long> {

    public UserInfo findByusername(String username);

}
