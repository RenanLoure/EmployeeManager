package com.erudio.employeemanager.err;

public class UserNotFoundException extends RuntimeException{

  public UserNotFoundException(String message){
    super(message);
  }
  
}
