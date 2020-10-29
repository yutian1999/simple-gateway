/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wengyz
 * @version
 */
@SpringBootApplication(scanBasePackages = {"com.yutian","com.yutian.service"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}