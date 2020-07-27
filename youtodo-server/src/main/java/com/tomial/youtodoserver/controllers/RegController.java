package com.tomial.youtodoserver.controllers;

import com.tomial.youtodoserver.beans.ResponseMessage;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.services.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/register")
public class RegController {

  private final RegisterService registerService;

  @CrossOrigin
  @PostMapping
  public ResponseMessage createUser(@RequestBody TodoUser todoUser) {
    return registerService.Register(todoUser);
  }

  //  @GetMapping("/set")
  //  public String set(HttpServletRequest request,  HttpSession session) {
  //    Object user = session.getAttribute("user");
  //    Cookie[] cookies = request.getCookies();
  //    for (Cookie cookie : cookies) {
  //      System.out.println(cookie.getName() + " : " + cookie.getValue());
  //    }
  //    if(user == null) {
  //      System.out.println("无用户登陆");
  //      session.setAttribute("user", "mudai");
  //      return "无用户登陆session";
  //    } else {
  //      System.out.println(user.toString() + "登陆了");
  //      return "有用户登陆session";
  //    }
  //  }

}
