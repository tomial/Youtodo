package com.tomial.youtodoserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String helloAdmin() {
    return "hello admin";
  }

}
