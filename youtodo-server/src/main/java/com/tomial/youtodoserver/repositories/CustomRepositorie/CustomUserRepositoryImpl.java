package com.tomial.youtodoserver.repositories.CustomRepositorie;

import com.tomial.youtodoserver.exceptions.UserNotFoundException;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.TodoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository<TodoUser> {

  private final TodoUserRepository repository;

  public Long findUserIdByUsername(String username) {
    return repository
        .findUserByAccount(username)
        .orElseThrow(() -> new UserNotFoundException(username))
        .getId();
  }
}
