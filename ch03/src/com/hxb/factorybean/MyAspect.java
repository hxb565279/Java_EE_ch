package com.hxb.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        check_Permissions();
        Object oj = methodInvocation.proceed();
        log();
        return oj;
    }

    public void check_Permissions() {
        System.out.println("模拟检查权限");
    }

    public void log() {
        System.out.println("模拟记录日志");
    }

}
