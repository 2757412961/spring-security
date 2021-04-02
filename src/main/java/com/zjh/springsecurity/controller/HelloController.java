package com.zjh.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zjh
 * @date : 2021/4/1 20:57
 * @Email : 2757412961@qq.com
 * @update:
 */

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello Spring security";
    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasAnyRole('admin')")
    public String helloAdmin() {
        return "helloAdmin Spring security";
    }

    @GetMapping("/helloUser")
    @PreAuthorize("hasAnyRole('normal', 'admin')")
    public String helloUser() {
        return "helloUser Spring security";
    }


}
