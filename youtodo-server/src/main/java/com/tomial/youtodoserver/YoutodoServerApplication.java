package com.tomial.youtodoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class YoutodoServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(YoutodoServerApplication.class, args);
  }

}
