package com.example.demo.dao;

import com.example.demo.entity.EntityUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dima on 27.06.2017.
 */
@Repository
public class DaoUserImplements implements DaoUserInterface {
    private static Map<Integer, EntityUser> users;

    static{
        users = new HashMap<Integer, EntityUser>(){
            {
                put(1, new EntityUser( 1, "Dmytro", "Kovalchuk", 28));
                put(2, new EntityUser(2, "Vasiliy", "Pupkin", 47));
                put(3, new EntityUser(3, "Kiril", "Sidirov", 47));
            }
        };
    }

    @Override
    public Collection<EntityUser> getAllUsers() {
        return this.users.values();
    }

    @Override
    public EntityUser getUserById(Integer id){
        return this.users.get(id);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.users.remove(id);
    }

    @Override
    public void updateUser(EntityUser user){
        EntityUser userToUpdate = users.get(user.getUserId());
        userToUpdate.setUserAge(user.getUserAge());
        userToUpdate.setUserName(user.getUserName());
        userToUpdate.setUserSecondName(user.getUserSecondName());
        users.put(user.getUserId(),user);
    }

    @Override
    public void insertUser(EntityUser user) {
        EntityUser userToInsert = new EntityUser();
        userToInsert.setUserName(user.getUserName());
        userToInsert.setUserSecondName(user.getUserSecondName());
        userToInsert.setUserAge(user.getUserAge());
        userToInsert.setUserId(user.getUserId());
        this.users.put(user.getUserId(),userToInsert);
    }
}
