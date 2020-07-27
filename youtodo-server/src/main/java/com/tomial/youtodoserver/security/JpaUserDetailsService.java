package com.tomial.youtodoserver.security;

import com.tomial.youtodoserver.exceptions.UserNotFoundException;
import com.tomial.youtodoserver.models.Role;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.TodoUserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class JpaUserDetailsService implements UserDetailsService {

//  private final PasswordEncoder passwordEncoder;
  private final TodoUserRepository userRepository;
  private final Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    Optional<TodoUser> optional = userRepository.findUserByAccount(s);
    TodoUser user = optional.orElseThrow(() -> new UserNotFoundException(s));

    List<Role> roles = user.getRoles();
    List<SimpleGrantedAuthority> authorities = new ArrayList<>();
    for(Role role : roles) {
      authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
    }
    logger.warn("Custom JpaUserDetailsService Involved!!!!!!!!!!!!!!!");
    return User.builder()
        .username(user.getAccount())
        .password(user.getPassword())
        .authorities(authorities)
        .build();
  }
}
