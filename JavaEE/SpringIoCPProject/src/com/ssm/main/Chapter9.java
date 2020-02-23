package com.ssm.main;

import com.ssm.pojo.Juice;

public class Chapter9 {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Juice juice = (Juice) ctx.get
    }
}
