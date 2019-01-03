package mjc.dao;


import java.util.List;

import mjc.dao.example.UserExample;
import mjc.domain.Permission;
import mjc.domain.User;

import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    List<Permission> queryRolePermissionByUser(User user);
}