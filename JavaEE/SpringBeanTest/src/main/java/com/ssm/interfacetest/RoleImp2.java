package com.ssm.interfacetest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("roleImp2")
public class RoleImp2 implements Role {
    @Value("linqinhua")
    private String name;

    public String getName() {
        return name;
    }
}
