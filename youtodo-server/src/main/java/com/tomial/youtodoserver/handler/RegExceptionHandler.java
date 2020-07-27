package com.tomial.youtodoserver.handler;

import com.tomial.youtodoserver.exceptions.AccountNotDefinedException;
import com.tomial.youtodoserver.exceptions.InvalidNicknameException;
import com.tomial.youtodoserver.exceptions.InvalidPasswordException;
import com.tomial.youtodoserver.exceptions.UserAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RegExceptionHandler {
  @ExceptionHandler(InvalidPasswordException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST) //400 BAD REQUEST
  public String invalidPasswordHandler(InvalidPasswordException exception) {
    return exception.getMessage();
  }

  @ExceptionHandler(AccountNotDefinedException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST) //400 BAD REQUEST
  public String accountNotDefinedHandler(AccountNotDefinedException exception) {
    return exception.getMessage();
  }

  @ExceptionHandler(UserAlreadyExistException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String userAlreadyExistHandler(UserAlreadyExistException exception) {
    return exception.getMessage();
  }

  @ExceptionHandler(InvalidNicknameException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public String invalidNicknameException(InvalidNicknameException exception) {
    return exception.getMessage();
  }
}
