/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.result;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 *
 * @author wengyz
 * @version ResultModel.java, v 0.1 2020-10-26 1:59 下午
 */
public class ResultModel<T> implements Serializable {

    private Boolean isSuccess = true;

    private T data;

    private String errorCode;

    private String errorMsg;

    public Boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}