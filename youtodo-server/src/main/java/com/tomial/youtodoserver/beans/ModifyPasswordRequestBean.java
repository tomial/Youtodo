package com.tomial.youtodoserver.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ModifyPasswordRequestBean {

  private @Getter @Setter Long id;
  private @Getter @Setter String password;
}
