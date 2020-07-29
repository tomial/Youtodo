package com.tomial.youtodoserver.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {
  private @Setter @Getter String message;

  @Override
  public String toString() {
    return "ResponseMessage{" + "message='" + message + '\'' + '}';
  }
}
