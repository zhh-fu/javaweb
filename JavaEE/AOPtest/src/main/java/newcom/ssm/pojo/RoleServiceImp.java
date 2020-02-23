package newcom.ssm.pojo;

import newcom.ssm.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleMapper roleMapper = null;

    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation =Isolation.READ_COMMITTED)
    public int insertRole(Role role) {
        return roleMapper.insertRole(role);
    }
}
