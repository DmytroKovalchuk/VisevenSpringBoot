package com.example.demo.service;

import com.example.demo.dao.DaoUser;
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
    private DaoUser daoUser;

    public Collection<EntityUser> getAllUsers() {
        return this.daoUser.getAllUsers();
    }

    public EntityUser getUserById(Integer id){
        return daoUser.getUserById(id);
    }
}
