/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 *
 * @author wengyz
 * @version Request.java, v 0.1 2020-10-27 5:05 下午
 */
public class Request implements Serializable {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}