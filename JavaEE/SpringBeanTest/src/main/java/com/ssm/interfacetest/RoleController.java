package com.ssm.interfacetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController {
    @Autowired
    @Qualifier("roleImp1")
    private Role role = null;

    public void print(Role role){
        System.out.println(role.getName());
    }
}
