package com.spring.hellobean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ApplicationConfiguration {
//    @Bean
//    public HelloBeanAspect helloBeanAspect() {
//        return new HelloBeanAspect();
//    }
//
//    @Bean
//    public HelloBean helloBean()
//    {
//        return new HelloBean();
//    }
}
