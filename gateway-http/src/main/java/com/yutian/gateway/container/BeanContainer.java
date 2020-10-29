/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.container;

import com.yutian.gateway.proxy.BeanProxy;

import java.util.HashMap;

/**
 *
 * @author wengyz
 * @version BeanContainer.java, v 0.1 2020-10-27 3:58 下午
 */
public class BeanContainer extends HashMap<String, BeanProxy> {

    private static final BeanContainer container = new BeanContainer();

    private BeanContainer(){
    }

    public static BeanContainer newBeanContainer(){
        return container;
    }
}