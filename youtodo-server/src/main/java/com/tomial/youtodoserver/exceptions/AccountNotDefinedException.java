package com.tomial.youtodoserver.exceptions;

public class AccountNotDefinedException extends RuntimeException {
  public AccountNotDefinedException() {
    super("Account Not Defined!");
  }
}
