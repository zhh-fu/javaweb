package com.ssm.interceptor;

public class RoleInterceptor implements Interceptor {

    @Override
    public void before(Object obj) {
        System.out.println("ready!");
    }

    @Override
    public void after(Object obj) {
        System.out.println("done!");
    }

    @Override
    public void afterReturning(Object obj) {
        System.out.println("Everything is ok!");
    }

    @Override
    public void afterThrowing(Object obj) {
        System.out.println("Waring!Exception!");
    }
}
