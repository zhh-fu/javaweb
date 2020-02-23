package com.ssm.main;


import com.ssm.game.ProxyBeanFactory;
import com.ssm.interceptor.Interceptor;
import com.ssm.interceptor.RoleInterceptor;
import com.ssm.pojo.Role;
import com.ssm.pojo.RoleService;
import com.ssm.pojo.RoleServiceImp;

public class mainApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        RoleService roleService=new RoleServiceImp();
        Interceptor interceptor=new RoleInterceptor();
        RoleService proxy =(RoleService) new ProxyBeanFactory().getBean(roleService,interceptor);
        Role role = new Role(1,"fizhihang","难啊！");
        proxy.printRole(role);
        role = null;
        proxy.printRole(role);
    }
}
