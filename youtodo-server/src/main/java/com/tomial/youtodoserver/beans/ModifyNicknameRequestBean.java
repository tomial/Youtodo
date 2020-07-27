package com.tomial.youtodoserver.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ModifyNicknameRequestBean {

  private @Getter @Setter Long id;
  private @Getter @Setter String nickname;
}
