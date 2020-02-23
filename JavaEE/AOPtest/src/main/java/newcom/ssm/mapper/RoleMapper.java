package newcom.ssm.mapper;

import org.springframework.stereotype.Repository;
import newcom.ssm.pojo.Role;

@Repository
public interface RoleMapper {
    public int insertRole(Role role);
}
