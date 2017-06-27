package com.example.demo.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by Dima on 27.06.2017.
 */
//

public class EntityUser {
    private Integer userId;
    private String userName;
    private String userSecondName;
    private Integer userAge;

    public EntityUser(Integer userId, String userName, String userSecondName, Integer userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.userAge = userAge;
    }

    public EntityUser() {
    }

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

    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "EntityUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSecondName='" + userSecondName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
