package com.tomial.youtodoserver.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "USER")
public class TodoUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Getter @Setter Long id;

  @NotNull
  @Column(name = "ACCOUNT", unique = true)
  private @Getter @Setter String account;

  @NotNull
  @Column(name = "PASSWORD")
  private @Getter @Setter String password;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "USER_ROLE", joinColumns = {@JoinColumn(name = "USER_ID")},
      inverseJoinColumns = {@JoinColumn(name = "ROLE_ID")})
  private @Getter @Setter List<Role> roles = new ArrayList<>();

  @Column(name = "NICKNAME")
  private @Getter @Setter String nickname;

  @Column(name = "EMAIL")
  private @Getter @Setter String email;

  @CreatedDate
  @Column(name = "CREATED_AT")
  private @Getter @Setter Date createdAt;

  @Column(name = "ENABLED")
  private @Getter @Setter Boolean enabled;

  @Override
  public String toString() { // User类toString()
    return "TodoUser{" + "id=" + id + ", account='" + account + '\'' + ", roles=" + roles
        + ", createdAt=" + createdAt + '}';// ArrayList<Role>
  }

  public TodoUser(String account, String password) {
    this.account = account;
    this.password = password;
  }
}
