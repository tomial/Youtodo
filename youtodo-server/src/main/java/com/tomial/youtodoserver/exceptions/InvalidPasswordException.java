package com.tomial.youtodoserver.exceptions;

public class InvalidPasswordException extends RuntimeException {

  public InvalidPasswordException() {
    super("Invalid Password!");
  }
}
