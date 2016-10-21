package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.user.exception.InvalidPasswordException;

public class SingleAuthenticatedUser implements AuthenticatedUser{

  private String password;
  private String passwordToMatch;
  private String id;

  public SingleAuthenticatedUser(String password, String passwordToMatch, String id) {
    this.password = password;
    this.passwordToMatch = passwordToMatch;
    this.id = id;

    if (!password.equals(passwordToMatch)) {
      throw new InvalidPasswordException();
    }
  }

}
