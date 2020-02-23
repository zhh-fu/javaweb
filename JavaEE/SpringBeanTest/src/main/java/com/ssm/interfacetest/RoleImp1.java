package com.ssm.interfacetest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("roleImp1")
public class RoleImp1 implements Role {
    @Value("fuzhihang")
    private String name;

    public String getName(){
        return name;
    }
}
