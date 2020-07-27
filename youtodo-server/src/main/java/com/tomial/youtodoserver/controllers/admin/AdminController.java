package com.tomial.youtodoserver.controllers.admin;

import com.tomial.youtodoserver.beans.ResponseMessage;
import com.tomial.youtodoserver.models.Role;
import com.tomial.youtodoserver.services.UserService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/admin")
public class AdminController {

  private final UserService userService;

  @GetMapping("/roles/{id}") // 获取用户权限
  public List<Role> getUserRole(@PathVariable Long id) {
    return userService.getUserRoles(id);
  }

  @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
  @PutMapping("/roles/{id}") // 管理员设置用户权限
  public ResponseMessage setUserRoles(@PathVariable Long id, @RequestBody List<Role> roles) {
    return userService.setUserRoles(id, roles);
  }
}
