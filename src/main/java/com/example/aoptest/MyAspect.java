package com.example.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("within(com.example.aoptest.MyComponent)")
    public void before(JoinPoint joinPoint) {
        System.out.printf("before %s\n",joinPoint.getSignature());
    }
    @After("within(com.example.aoptest.MyComponent)")
    public void after(JoinPoint joinPoint) {
        System.out.printf("after %s\n",joinPoint.getSignature());
    }
}
