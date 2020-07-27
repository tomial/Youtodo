package com.tomial.youtodoserver.repositories.CustomRepositorie;

public interface CustomUserRepository<T> {
  public Long findUserIdByUsername(String username);
}
