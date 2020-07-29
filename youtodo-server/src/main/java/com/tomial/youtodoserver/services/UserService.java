package com.tomial.youtodoserver.services;

import com.tomial.youtodoserver.beans.ModifyEmailRequestBean;
import com.tomial.youtodoserver.beans.ModifyNicknameRequestBean;
import com.tomial.youtodoserver.beans.ModifyPasswordRequestBean;
import com.tomial.youtodoserver.beans.ResponseMessage;
import com.tomial.youtodoserver.exceptions.EmptyRoleListException;
import com.tomial.youtodoserver.exceptions.InvalidNicknameException;
import com.tomial.youtodoserver.exceptions.InvalidPasswordException;
import com.tomial.youtodoserver.exceptions.UserNotFoundException;
import com.tomial.youtodoserver.models.Role;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.TodoUserRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private final TodoUserRepository userRepository;

  public TodoUser findUser(Long id) {
    Optional<TodoUser> user = userRepository.findById(id);
    if (user.isPresent()) {
      return user.get();
    } else {
      throw new UserNotFoundException(id);
    }
  }

  public List<Role> getUserRoles(Long id) {
    return findUser(id).getRoles();
  }

  public ResponseMessage setUserRoles(Long id, List<Role> roles) {
    if (roles.size() <= 0) {
      throw new EmptyRoleListException();
    }
    TodoUser user = findUser(id);
    user.setRoles(roles);
    userRepository.save(user);

    return new ResponseMessage("Successfully changed user's role");
  }

  public ResponseMessage setEmail(ModifyEmailRequestBean requestBean) {
    Long id = requestBean.getId();
    String email = requestBean.getEmail();
    TodoUser user = findUser(id);
    user.setEmail(email);
    userRepository.save(user);
    return new ResponseMessage("user with id:[" + id + "]'s email has been set");
  }

  public ResponseMessage setPassword(ModifyPasswordRequestBean requestBean) {
    if (requestBean.getPassword().length() <= 0) {
      throw new InvalidPasswordException();
    }
    TodoUser user = findUser(requestBean.getId());
    user.setPassword(requestBean.getPassword());
    userRepository.save(user);
    return new ResponseMessage("Successfully changed the password");
  }

  public ResponseMessage setNickname(ModifyNicknameRequestBean requestBean) {
    if (requestBean.getNickname().length() <= 0) {
      throw new InvalidNicknameException();
    }
    TodoUser user = findUser(requestBean.getId());
    user.setNickname(requestBean.getNickname());
    userRepository.save(user);
    return new ResponseMessage("Successfully changed the nickname");
  }
}
