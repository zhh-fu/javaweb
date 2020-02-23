package com.ssm.pojo;

public class RoleServiceImp implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println("id=" + role.getId() + "," + "name=" + role.getRoleName() + "," + "note=" + role.getNote());
    }
}
