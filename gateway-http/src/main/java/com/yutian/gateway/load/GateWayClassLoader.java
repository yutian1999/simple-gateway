/**
 * aljk.com
 * Copyright (C) 2013-2020 All Rights Reserved.
 */
package com.yutian.gateway.load;

import com.yutian.gateway.annotation.Interface;
import com.yutian.gateway.container.BeanContainer;
import com.yutian.gateway.proxy.BeanProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.lang.reflect.Method;



/**
 *
 * @author wengyz
 * @version ClassLoader.java, v 0.1 2020-10-27 10:26 上午
 */
@Component
public class GateWayClassLoader implements  ApplicationContextAware, InitializingBean {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void afterPropertiesSet() throws Exception {
        BeanContainer beanMap = BeanContainer.newBeanContainer();
        String[] beanNames = applicationContext.getBeanNamesForAnnotation(Service.class);
        for (String beanName : beanNames) {
            Object bean = applicationContext.getBean(beanName);
            Class<?>[] interfaces = bean.getClass().getInterfaces();
            for (Class<?> anInterface : interfaces) {
                Method[] methods = anInterface.getDeclaredMethods();
                for (Method declaredMethod : methods) {
                    Interface annotation = declaredMethod.getAnnotation(Interface.class);
                    if (annotation != null){
                        String method = annotation.method();
                        beanMap.put(method,new BeanProxy(bean,declaredMethod,declaredMethod.getParameterTypes()[0]));
                    }
                }
            }
        }
    }
}