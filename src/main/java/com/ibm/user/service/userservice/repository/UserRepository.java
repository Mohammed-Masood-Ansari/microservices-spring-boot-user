package com.ibm.user.service.userservice.repository;

import com.ibm.user.service.userservice.entiries.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
