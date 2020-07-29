package com.tomial.youtodoserver.exceptions;

import org.springframework.security.core.AuthenticationException;

public class AccountNotDefinedException extends AuthenticationException {
  public AccountNotDefinedException() {
    super("Account Not Defined!");
  }
}
