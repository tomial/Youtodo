package com.tomial.youtodoserver.services;

import com.tomial.youtodoserver.beans.ResponseMessage;
import com.tomial.youtodoserver.exceptions.AccountNotDefinedException;
import com.tomial.youtodoserver.exceptions.InvalidPasswordException;
import com.tomial.youtodoserver.exceptions.UserAlreadyExistException;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.TodoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterService {

  private final TodoUserRepository userRepository;
  private final BCryptPasswordEncoder passwordEncoder;

  public ResponseMessage Register(TodoUser user) {

    if (userRepository.findUserByAccount(user.getAccount()).isPresent()) {
      throw new UserAlreadyExistException();
    } else if (user.getPassword() == null) {
      throw new InvalidPasswordException();
    } else if (user.getAccount() == null) {
      throw new AccountNotDefinedException();
    }
    encryptPassword(user);
    userRepository.save(user);
    return new ResponseMessage("User: " + user.getAccount() + " Added");
  }

  private void encryptPassword(TodoUser user) {
    String password = user.getPassword();
    user.setPassword(passwordEncoder.encode(password));
  }
}
