package com.tomial.youtodoserver.exceptions;

import org.springframework.security.core.AuthenticationException;

public class InvalidPasswordException extends AuthenticationException {

  public InvalidPasswordException() {
    super("Invalid Password!");
  }
}
