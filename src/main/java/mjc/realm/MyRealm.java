package mjc.realm;

import mjc.domain.Permission;
import mjc.domain.User;

import mjc.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;

import org.apache.shiro.subject.PrincipalCollection;


import java.util.List;

/**
 * Created by gcb on 2018/12/29.
 */
public class MyRealm extends AuthorizingRealm {


    //这个service 不知道为什么通过 注解就是无法注入 只好通过<bean> 注入
    private ShiroService shiroService;


    /**
     * 登入 收集  principalCollection
     * @param principalCollection
     * @return
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)  throws AuthorizationException {

        /**
         *
         * 流程
         * 1.根据用户user->2.获取角色id->3.根据角色id获取权限permission
         */
        //方法一：获得user对象
        User user=(User)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取permission
        if(user!=null) {
            List<Permission> permissionsByUser = shiroService.getPermissionsByUser(user);
            if (permissionsByUser.size()!=0) {
                for (Permission p: permissionsByUser) {
                    info.addStringPermission(p.getPermission());
            }
                return info;
            }
        }


        return null;
    }

    /**
     * 身份验证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        System.out.println("1:"+token.getUsername());
        User user = shiroService.getUserByUserName(token.getUsername());
        System.out.println("2");
        if(user==null){
            return null;
        }
        //最后的比对需要交给安全管理器
        //三个参数进行初步的简单认证信息对象的包装
        AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getUserPassword(), this.getClass().getSimpleName());

        return info;

    }

    public ShiroService getShiroService() {
        return shiroService;
    }

    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }
}
