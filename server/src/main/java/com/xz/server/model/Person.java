package com.xz.server.model;

import base.BaseEntity;
import com.xz.server.util.SexType;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends BaseEntity {

    /**
     * 姓名
     */
    @Getter
    @Column(nullable = false)
    private String name;

    /**
     * 性别
     */
    @Getter
    @Column(nullable = false)
    private SexType sex;

    /**
     * 年龄
     */
    @Getter
    @Column(nullable = false)
    private String age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setSex(SexType sex) {
        this.sex = sex;
        return this;
    }

    public Person setAge(String age) {
        this.age = age;
        return this;
    }
}
