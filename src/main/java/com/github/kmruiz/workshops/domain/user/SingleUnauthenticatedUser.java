package com.github.kmruiz.workshops.domain.user;

public class SingleUnauthenticatedUser implements UnauthenticatedUser {

  private String id;

  public SingleUnauthenticatedUser(String id) {
    this.id = id;
  }

  @Override
  public SingleAuthenticatedUser login(String password, String passwordToMatch) {
    return new SingleAuthenticatedUser(password, passwordToMatch, id);
  }
}
