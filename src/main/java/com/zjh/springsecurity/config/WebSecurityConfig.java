package com.zjh.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: zjh
 * @date : 2021/4/1 21:07
 * @Email : 2757412961@qq.com
 * @update:
 */

@Configuration
@EnableWebSecurity // 启用 SpringBoot Security
@EnableGlobalMethodSecurity(prePostEnabled = true) // 拦截注解了 @PreAuthorize 注解的配置
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //注入 PasswordEncode
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * @Description: 通过复写configure 方法，进行用户创建
     * @Param: [auth]
     * @return: void
     * @Author: zjh
     * @Date: 2021/4/1
     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        /*
//         * 基于内存的方式创建
//         */
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password(passwordEncoder().encode("123456"))
//                .roles("admin");
//
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password(passwordEncoder().encode("123456"))
//                .roles("normal");
//    }
}
