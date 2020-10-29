/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.service;
import com.yutian.gateway.annotation.Interface;
import com.yutian.model.Request;
import com.yutian.model.Response;

/**
 *
 * @author wengyz
 * @version TestService.java, v 0.1 2020-10-27 2:21 下午
 */
public interface TestService {

    @Interface(method = "com.demo")
    Response demo(Request param);

}