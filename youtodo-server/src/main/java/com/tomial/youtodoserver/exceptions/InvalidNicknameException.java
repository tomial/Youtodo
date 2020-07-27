package com.tomial.youtodoserver.exceptions;

public class InvalidNicknameException extends RuntimeException {
  public InvalidNicknameException() {
    super("Invalid Nickname!");
  }
}
