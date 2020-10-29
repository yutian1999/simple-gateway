/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.invoke;

import com.alibaba.fastjson.JSON;
import com.yutian.gateway.container.BeanContainer;
import com.yutian.gateway.proxy.BeanProxy;
import com.yutian.gateway.result.ResultModel;
import com.yutian.gateway.result.ResultUtils;

import java.lang.reflect.Method;

/**
 *
 * @author wengyz
 * @version GatewayInvoker.java, v 0.1 2020-10-27 4:07 下午
 */
public class GatewayInvoker {

    public static ResultModel<Object> invoke(String methodName, String param){
        try {
            BeanContainer beanContainer = BeanContainer.newBeanContainer();
            BeanProxy beanProxy = beanContainer.get(methodName);
            if (beanProxy == null){
                return ResultUtils.failure("-400","没有对应的方法");
            }
            Method method = beanProxy.getMethod();
            Object bean = beanProxy.getBean();
            Class paramType = beanProxy.getParamType();
            Object object = JSON.parseObject(param, paramType);
            return ResultUtils.success(method.invoke(bean, object));
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtils.failure();
        }
    }
}