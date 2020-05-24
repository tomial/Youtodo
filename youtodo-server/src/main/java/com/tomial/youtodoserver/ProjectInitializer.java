package com.tomial.youtodoserver;


import com.tomial.youtodoserver.models.User;
import com.tomial.youtodoserver.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class ProjectInitializer {

  @Bean
  public CommandLineRunner initData(UserRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new User("xzdai", "123")));
      log.info("Preloading " + repository.save(new User("mudai", "123")));
    };
  }
}
