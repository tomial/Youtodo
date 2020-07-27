package com.tomial.youtodoserver.exceptions;

import org.springframework.security.core.AuthenticationException;

public class InvalidNicknameException extends AuthenticationException {
  public InvalidNicknameException() {
    super("Invalid Nickname!");
  }
}
