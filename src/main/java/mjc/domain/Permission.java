package mjc.domain;

import javax.persistence.*;

@Table(name = "t_permission")
public class Permission {
    @Id
    private Long id;

    /**
     * 和t_role 的id 对应
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限 采用url的形式 /login
     */
    private String permission;

    /**
     * 权限描述 
     */
    private String descriptiion;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取和t_role 的id 对应
     *
     * @return role_id - 和t_role 的id 对应
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置和t_role 的id 对应
     *
     * @param roleId 和t_role 的id 对应
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限 采用url的形式 /login
     *
     * @return permission - 权限 采用url的形式 /login
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限 采用url的形式 /login
     *
     * @param permission 权限 采用url的形式 /login
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取权限描述 
     *
     * @return descriptiion - 权限描述 
     */
    public String getDescriptiion() {
        return descriptiion;
    }

    /**
     * 设置权限描述 
     *
     * @param descriptiion 权限描述 
     */
    public void setDescriptiion(String descriptiion) {
        this.descriptiion = descriptiion;
    }
}