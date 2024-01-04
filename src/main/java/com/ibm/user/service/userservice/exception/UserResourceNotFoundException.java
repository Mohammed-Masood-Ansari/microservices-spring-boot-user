package com.ibm.user.service.userservice.exception;

public class UserResourceNotFoundException extends RuntimeException{

    public UserResourceNotFoundException(){
        super("Resource not available on server!!!!!!");
    }

    public UserResourceNotFoundException(String msg){
        super(msg);
    }
}
