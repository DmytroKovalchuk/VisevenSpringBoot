package com.example.demo.service;

import com.example.demo.dao.DaoUserImplements;
import com.example.demo.entity.EntityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Dima on 27.06.2017.
 */
//
@Service
public class ServiceUser {
    @Autowired
    private DaoUserImplements daoUserImplements;

    public Collection<EntityUser> getAllUsers() {
        return this.daoUserImplements.getAllUsers();
    }

    public EntityUser getUserById(Integer id){
        return daoUserImplements.getUserById(id);
    }

    public void deletUserById(Integer id) {
        daoUserImplements.deleteUserById(id);
    }

    public void updateUser(EntityUser user){
        daoUserImplements.updateUser(user);
    }

    public void insertUser(EntityUser user) {
        daoUserImplements.insertUser(user);
    }
}
