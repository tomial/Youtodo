package com.tomial.youtodoserver.exceptions;

import java.io.IOException;

public class PasswordNotDefinedException extends RuntimeException {

  public PasswordNotDefinedException() {
    super("Password Not Defined!");
  }
}
