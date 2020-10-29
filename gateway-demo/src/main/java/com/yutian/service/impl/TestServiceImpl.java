/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.service.impl;
import com.yutian.gateway.annotation.Interface;
import com.yutian.model.Request;
import com.yutian.model.Response;
import com.yutian.service.ReferenceService;
import com.yutian.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 * @author wengyz
 * @version TestServiceImpl.java, v 0.1 2020-10-27 11:21 上午
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private ReferenceService referenceService;

    public Response demo(Request param) {
        referenceService.test();
        System.out.println("hello " + param);
        Response response = new Response();
        response.setResult("result is ok");
        response.setPrice(200);
        return response;
    }
}