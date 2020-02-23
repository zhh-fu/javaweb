package newcom.ssm.main;

import newcom.ssm.pojo.Role;
import newcom.ssm.pojo.RoleListService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class mainApplication1 {
    public static void main(String[] args){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("newcom/ssm/spring-cfg.xml");
        RoleListService roleListService=ctx.getBean(RoleListService.class);
        List<Role> roleList=new ArrayList<Role>();
        for(int i=1;i<=2;i++){
            Role role = new Role(i+3,"rolename"+i,"note"+i);
            roleList.add(role);
        }
        int count=roleListService.insertRoleList(roleList);
        System.out.println(count);
    }
}
