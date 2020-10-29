/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.result;

/**
 *
 * @author wengyz
 * @version ResultUtils.java, v 0.1 2020-10-27 2:30 下午
 */
public class ResultUtils{

    private static final String ERROR_CODE = "-200";
    private static final String ERROR_MSG = "服务器内部错误";

    private ResultUtils(){}

    public static <T> ResultModel<T> success(T t){
        ResultModel<T> resultModel = new ResultModel<T>();
        resultModel.setData(t);
        return resultModel;
    }

    public static <T> ResultModel<T> success(){
        return new ResultModel<T>();
    }

    public static <T> ResultModel<T> failure(String errorCode,String errorMsg){
        ResultModel<T> resultModel = new ResultModel<T>();
        resultModel.setSuccess(false);
        resultModel.setErrorCode(errorCode);
        resultModel.setErrorMsg(errorMsg);
        return resultModel;
    }

    public static <T> ResultModel<T> failure(){
        return failure(ERROR_CODE,ERROR_MSG);
    }

    public static void main(String[] args) {
        System.out.println(ResultUtils.success());
        System.out.println(ResultUtils.success("hello"));
        System.out.println(ResultUtils.failure());
    }

}