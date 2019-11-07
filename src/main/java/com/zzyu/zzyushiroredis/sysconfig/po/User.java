package com.zzyu.zzyushiroredis.sysconfig.po;

/**
 * @ProjectName: zzyushiroredis
 * @Package: com.zzyu.zzyushiroredis.sysconfig.po
 * @ClassName: User
 * @Author: zeyu.zhang
 * @Description: ${description}
 * @Date: 2019/11/4 13:11
 * @Version: 1.0
 */
public class User {

    private Integer id;

    private String userName;

    private String password;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
