package com.tomial.youtodoserver.exceptions;

public class UserAlreadyExistException extends RuntimeException {
  public UserAlreadyExistException() {
    super("User Already Exist!");
  }
}
