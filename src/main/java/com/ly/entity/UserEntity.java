package com.ly.entity;


import javax.persistence.*;

@Table(name="t_user")
@Entity
public class UserEntity {

    @Id
    private String userId;
    private String userName;
    @Column(name="user_psd")
    private String userPassword;
    @Column(columnDefinition = "tinyint")
    private Integer active;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
}
