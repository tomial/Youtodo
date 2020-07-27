package com.tomial.youtodoserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "ROLE")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Getter @Setter Long id;

  @Override
  public String toString() { // Role类toString()
    return "Role{" + "id=" + id + ", name='" + name + '\'' + '}';
  }

  @NotNull private @Getter @Setter String name;

//  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  @JoinTable(
//      name = "USER_ROLE",
//      joinColumns = {@JoinColumn(name = "ROLE_ID")},
//      inverseJoinColumns = {@JoinColumn(name = "USER_ID")})
//  private List<TodoUser> users = new ArrayList<>();

  public Role(String name) {
    this.name = name;
  }
}
