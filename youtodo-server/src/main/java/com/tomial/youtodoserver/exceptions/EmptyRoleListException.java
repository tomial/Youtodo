package com.tomial.youtodoserver.exceptions;

public class EmptyRoleListException extends RuntimeException {

  public EmptyRoleListException() {
    super("Error:Empty role list!");
  }
}
