package com.tomial.youtodoserver.controllers;

import com.tomial.youtodoserver.exceptions.PasswordNotDefinedException;
import com.tomial.youtodoserver.models.User;
import com.tomial.youtodoserver.repositories.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("user/{id}")
  @CrossOrigin
  public User getUser(@PathVariable Long id) {
    return userRepository.findById(id).get();
  }

  @PostMapping("/user")
  @CrossOrigin
  public User createUser(@RequestBody User user) throws PasswordNotDefinedException {
    if (user.getPassword() == null) {
      throw new PasswordNotDefinedException();
    }
    return userRepository.save(user);
  }
}
