package com.ibm.user.service.userservice.services.impl;

import com.ibm.user.service.userservice.exception.UserResourceNotFoundException;
import com.ibm.user.service.userservice.services.UserService;
import com.ibm.user.service.userservice.entiries.User;
import com.ibm.user.service.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUserData() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new UserResourceNotFoundException());
    }


}
