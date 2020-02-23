package com.ssm.main;

import com.ssm.pojo.Juice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("sp-config.xml");
        Juice juice = (Juice) ctx.getBean("juice");
        System.out.println(juice.makeJuice());
    }
}
