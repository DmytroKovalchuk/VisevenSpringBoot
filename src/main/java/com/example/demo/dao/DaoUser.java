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
public class DaoUser {
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

    public Collection<EntityUser> getAllUsers() {
        return this.users.values();
    }

    public EntityUser getUserById (Integer id){
        return users.get(id);
    }


}
