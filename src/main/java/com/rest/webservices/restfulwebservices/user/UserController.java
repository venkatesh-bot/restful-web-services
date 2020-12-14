package com.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findUser/{id}")
    public User getUserByID(@PathVariable int id) {
        User user = userService.findOne(id);
        if (user == null){
            throw new UserNotFoundException("For id : " + id);
        }
        return user;
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUserByID(@PathVariable int id) {
        User user = userService.deleteUserByID(id);
        if(user == null){
            throw new UserNotFoundException("For ID : " + id);
        }
    }

    @PostMapping("/addUser")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = userService.save(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(savedUser.getID())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
