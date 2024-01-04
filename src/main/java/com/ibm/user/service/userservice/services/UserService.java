package com.ibm.user.service.userservice.services;

import com.ibm.user.service.userservice.entiries.User;

import java.util.List;

public interface UserService {

    //userOperation we have to perform

    //saveUser abstarct method
    User saveUser(User user);

    //getAllUserData

    List<User> getAllUserData();

    //getUserById
    User getUserById(String userId);

    //ToDo: Delete method
    //ToDo: Update method
}
