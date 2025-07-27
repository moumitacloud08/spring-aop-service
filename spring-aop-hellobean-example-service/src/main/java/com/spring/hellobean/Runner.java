package com.spring.hellobean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.hellobean.beans.HelloBean;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        HelloBean helloBean = context.getBean(HelloBean.class);

        helloBean.sayHello();
    }
}
