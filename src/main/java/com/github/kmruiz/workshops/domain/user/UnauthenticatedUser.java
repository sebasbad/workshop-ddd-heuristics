package com.github.kmruiz.workshops.domain.user;

public interface UnauthenticatedUser extends User {

  AuthenticatedUser login(String password, String passwordToMatch);
}
