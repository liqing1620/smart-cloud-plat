package com.xz.server.model;

import com.xz.server.util.StatusType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "sc_name")
public class User extends Person {

    /**
     * 用户名
     */
    @Getter
    @Setter
    private String username;

    /**
     * 密码
     */
    @Getter
    @Setter
    private String password;

    /**
     * 头像
     */
    @Getter
    @Setter
    private String avatar;

    /**
     * 邮箱
     */
    @Getter
    @Setter
    private String email;

    /**
     * 电话
     */
    @Getter
    @Setter
    private String tel;

    /**
     * 地址
     */
    @Getter
    @Setter
    private String address;

    /**
     * 生日
     */
    @Getter
    @Setter
    private String birthday;

    /**
     * 用户状态
     */
    @Getter
    @Setter
    private StatusType status;

}
