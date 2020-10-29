/**
 * aljk.com
 * Copyright (C) 2013-2020All Rights Reserved.
 */
package com.yutian.gateway.annotation;
import java.lang.annotation.*;

/**
 *
 * @author wengyz
 * @version Interface.java, v 0.1 2020-10-26 2:03 下午
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Interface {
    String method() default "";
}