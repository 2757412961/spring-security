package com.zjh.springsecurity.permission.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: zjh
 * @date : 2021/4/1 21:39
 * @Email : 2757412961@qq.com
 * @update:
 */

@Data
@Entity
public class UserInfo {

    @Id @GeneratedValue
    private long uid;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        admin, normal
    }

}
