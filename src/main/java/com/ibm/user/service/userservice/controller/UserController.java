package com.ibm.user.service.userservice.controller;

import com.ibm.user.service.userservice.entiries.User;
import com.ibm.user.service.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/saveUser")
    public ResponseEntity<User> saveUserController(@RequestBody User user){
         /*
            generate random unique numbers
         */
//        String id = UUID.randomUUID().toString();
//        user.setUserId(id);
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping(value = "getUser/{userId}")
    public ResponseEntity<User> getUserByIdController(@PathVariable String userId){

        User  user = userService.getUserById(userId);

        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/getAllUsers")
    public ResponseEntity<List<User>> getAllUserController(){

        List<User>  users = userService.getAllUserData();

        return ResponseEntity.status(HttpStatus.FOUND).body(users);
    }
}
