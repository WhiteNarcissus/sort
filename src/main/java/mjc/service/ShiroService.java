package mjc.service;

import mjc.domain.Permission;
import mjc.domain.User;

import java.util.List;

/**
 * Created by gcb on 2019/1/3.
 */
public interface ShiroService {

    public User getUserByUserName(String username);
    public List<Permission> getPermissionsByUser(User user);

}
