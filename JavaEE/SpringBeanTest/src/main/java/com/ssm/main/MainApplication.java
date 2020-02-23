package com.ssm.main;

import com.ssm.interfacetest.RoleController;
import com.ssm.pojo.Juice;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ssm.interfacetest.Role;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) throws Exception{
        //SpringApplication.run(MainApplication.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PojoConfig.class);
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/sp-config.xml");
        Juice juice = (Juice) ctx.getBean(Juice.class);
        System.out.println(juice.makeJuice());
        Role role =(Role) ctx.getBean("roleImp1");
        RoleController roleController=(RoleController) ctx.getBean(RoleController.class);
        roleController.print(role);
    }
}
