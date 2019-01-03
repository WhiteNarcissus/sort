package mjc.dao;


import java.util.List;

import mjc.dao.example.RoleExample;
import mjc.domain.Role;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    List<Role> selectByExample(RoleExample example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}