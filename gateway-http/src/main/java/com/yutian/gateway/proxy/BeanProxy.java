/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.proxy;

import java.lang.reflect.Method;

/**
 *
 * @author wengyz
 * @version BeanProxy.java, v 0.1 2020-10-27 4:13 下午
 */
public class BeanProxy{

    public BeanProxy(Object bean, Method method,Class paramType) {
        this.bean = bean;
        this.method = method;
        this.paramType = paramType;
    }

    private Object bean;

    private Method method;

    private Class paramType;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Class getParamType() {
        return paramType;
    }

    public void setParamType(Class paramType) {
        this.paramType = paramType;
    }
}