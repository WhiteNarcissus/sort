package mjc.dao;


import java.util.List;

import mjc.dao.example.PermissionExample;
import mjc.domain.Permission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PermissionMapper extends Mapper<Permission> {
    int countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    List<Permission> selectByExample(PermissionExample example);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);
}