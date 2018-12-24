package mjc.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码在 6-15位，字母+数字
     */
    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_hobbit")
    private String userHobbit;

    @Column(name = "user_message")
    private String userMessage;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码在 6-15位，字母+数字
     *
     * @return user_password - 密码在 6-15位，字母+数字
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置密码在 6-15位，字母+数字
     *
     * @param userPassword 密码在 6-15位，字母+数字
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * @return user_hobbit
     */
    public String getUserHobbit() {
        return userHobbit;
    }

    /**
     * @param userHobbit
     */
    public void setUserHobbit(String userHobbit) {
        this.userHobbit = userHobbit;
    }

    /**
     * @return user_message
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * @param userMessage
     */
    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
}