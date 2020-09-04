package top.yuyuandong.lc.model;

import java.io.Serializable;

/**
 * @Date: Created in ( 2020/8/28 18:49)
 * @Author: Lumos
 * @blog: yuyuandong.top
 * @Email: 321250835@qq.com
 * @Description:
 * @Modified By:
 */
public class User  implements Cloneable, Serializable {
    private Integer userId;
    private String userName;
    private String userPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
