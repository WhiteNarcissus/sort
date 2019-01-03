package mjc.service.impl;


import mjc.dao.UserMapper;

import mjc.dao.example.UserExample;
import mjc.domain.Permission;

import mjc.domain.User;
import mjc.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by gcb on 2019/1/3.
 */
public class ShiroServiceImpl implements ShiroService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByUserName(String username) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
     List<User> users =userMapper.selectByExample(userExample);
     if(users.isEmpty()){
         return null ;
     }
     return users.get(0);
    }

    @Override
    public List<Permission> getPermissionsByUser(User user) {


        List<Permission> permissions =  userMapper.queryRolePermissionByUser(user);

        return permissions;
    }
}
