package com.tomial.youtodoserver.repositories;

import com.tomial.youtodoserver.models.TodoUser;
import com.tomial.youtodoserver.repositories.CustomRepositorie.CustomUserRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoUserRepository extends JpaRepository<TodoUser, Long>,
    CustomUserRepository<TodoUser> {
  public Optional<TodoUser> findUserByAccount(String account);
}
