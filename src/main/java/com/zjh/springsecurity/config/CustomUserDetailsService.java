package com.zjh.springsecurity.config;

import com.zjh.springsecurity.permission.entity.UserInfo;
import com.zjh.springsecurity.permission.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author: zjh
 * @date : 2021/4/1 21:47
 * @Email : 2757412961@qq.com
 * @update:
 */

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername");
        /*
         * 1/通过username 获取到userInfo信息.
         * 2/通过User(UserDetails) 返回UserDetails.
         */
        UserInfo userInfo = userInfoService.findByUsername(username);
        if (userInfo == null) {
            throw new UsernameNotFoundException("user not found");
        }

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + userInfo.getRole().name()));

        User userDetails = new User(userInfo.getUsername(), passwordEncoder.encode(userInfo.getPassword()), authorities);

        return userDetails;
    }
}
