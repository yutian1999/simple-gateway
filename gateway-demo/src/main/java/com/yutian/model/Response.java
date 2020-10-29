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
 * @version Response.java, v 0.1 2020-10-27 5:06 下午
 */
public class Response implements Serializable {

    private String result;

    private Integer price;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}