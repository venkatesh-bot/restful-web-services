package com.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Venky", new Date()));
        users.add(new User(2, "Chinna", new Date()));
        users.add(new User(3, "Krishna", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getID() == null) {
            user.setID(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getID() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteUserByID(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getID() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
