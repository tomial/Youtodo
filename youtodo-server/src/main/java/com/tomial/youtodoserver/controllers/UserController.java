package com.tomial.youtodoserver.controllers;

import com.tomial.youtodoserver.beans.ModifyEmailRequestBean;
import com.tomial.youtodoserver.beans.ModifyNicknameRequestBean;
import com.tomial.youtodoserver.beans.ModifyPasswordRequestBean;
import com.tomial.youtodoserver.beans.ResponseMessage;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.services.UserService;
import java.security.Principal;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  @GetMapping("/{id}") // 获取用户信息
  @CrossOrigin
  @PreAuthorize(
      "@todoUserRepository.findUserIdByUsername(#principal.name).equals(#id)"
          + "or hasRole('ADMIN')")
  public TodoUser getUser(@PathVariable Long id, Principal principal) {
    System.out.println(principal.getName() + " accessed " + id + "'s information");
    return userService.findUser(id);
  }

  //  设置邮箱
  @PutMapping("/email")
  @PreAuthorize(
      "@todoUserRepository.findUserIdByUsername(#principal.name).equals(#requestBean.getId())"
          + "or hasRole('ADMIN')")
  public ResponseMessage setEmail(
      @RequestBody ModifyEmailRequestBean requestBean, Principal principal) {
    return userService.setEmail(requestBean);
  }

  //  更改密码
  @PutMapping("/password")
  @PreAuthorize(
      "@todoUserRepository.findUserIdByUsername(#principal.name).equals(#requestBean.getId())"
          + "or hasRole('ADMIN')")
  public ResponseMessage setPassword(
      @RequestBody ModifyPasswordRequestBean requestBean, Principal principal) {
    return userService.setPassword(requestBean);
  }

  //  设置昵称
  @PutMapping("/nickname")
  @PreAuthorize(
      "@todoUserRepository.findUserIdByUsername(#principal.name).equals(#requestBean.getId())"
          + "or hasRole('ADMIN')")
  public ResponseMessage setNickname(
      @RequestBody ModifyNicknameRequestBean requestBean, Principal principal) {
    return userService.setNickname(requestBean);
  }
}
