/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway;
import com.yutian.gateway.invoke.GatewayInvoker;
import com.yutian.gateway.result.ResultModel;
import com.yutian.gateway.result.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wengyz
 * @version GatewayController.java, v 0.1 2020-10-23 7:15 下午
 */
@RestController
public class GatewayController {

    @RequestMapping("/gateway")
    public ResultModel<Object> gateway(String appId,
                               String method,
                               String sign,
                               String content){
        // 验签 权限控制暂不实现
        return GatewayInvoker.invoke(method, content);
    }
}