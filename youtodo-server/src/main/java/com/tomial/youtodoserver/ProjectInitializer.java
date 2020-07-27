package com.tomial.youtodoserver;

import com.tomial.youtodoserver.models.Role;
import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.RoleRepository;
import com.tomial.youtodoserver.repositories.TodoUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@Configuration
@AllArgsConstructor
public class ProjectInitializer {

  private final PasswordEncoder passwordEncoder;

  @Bean
  public CommandLineRunner initData(TodoUserRepository userRepository,
      RoleRepository roleRepository) {
    return args -> {
      TodoUser user1 = new TodoUser("xzdai", passwordEncoder.encode("mima"));
      TodoUser user2 = new TodoUser("mudai", passwordEncoder.encode("123"));
      Role user_role = new Role("USER");
      Role admin_role = new Role("ADMIN");

      log.info("Preloading " + roleRepository.save(user_role));
      log.info("Preloading " + roleRepository.save(admin_role));

      user1.getRoles().add(user_role);
      user1.getRoles().add(admin_role);
      user2.getRoles().add(user_role);

      log.info("Preloading " + userRepository.save(user1));
      log.info("Preloading " + userRepository.save(user2));
    };
  }
}
