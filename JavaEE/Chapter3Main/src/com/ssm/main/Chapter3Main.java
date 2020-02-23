package com.ssm.main;

import com.ssm.mapper.RoleMapper;
import com.ssm.pojo.Role;
import com.ssm.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.*;

public class Chapter3Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Chapter3Main.class);
        SqlSession sqlSession = null;
        try
        {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            System.out.println(role.getRoleName());
        }
        finally
        {
            if (sqlSession != null)
                sqlSession.close();
        }
    }
}



