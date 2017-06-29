package com.example.demo.dao;

import com.example.demo.entity.EntityUser;

import java.sql.Connection;
import java.util.Collection;

/**
 * Created by Dima on 29.06.2017.
 */
public class PostgreDaoUserInterfaceImpl implements DaoUserInterface {

    Connection postgreConnection;

    @Override
    public Collection<EntityUser> getAllUsers() {
        return null;
    }

    @Override
    public EntityUser getUserById(Integer id) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }

    @Override
    public void updateUser(EntityUser user) {

    }

    @Override
    public void insertUser(EntityUser user) {

    }
}
