package com.example.demo.dao;

import com.example.demo.entity.EntityUser;

import java.util.Collection;

/**
 * Created by Dima on 29.06.2017.
 */
public interface DaoUserInterface {
    Collection<EntityUser> getAllUsers();

    EntityUser getUserById(Integer id);

    void deleteUserById(Integer id);

    void updateUser(EntityUser user);

    void insertUser(EntityUser user);
}
