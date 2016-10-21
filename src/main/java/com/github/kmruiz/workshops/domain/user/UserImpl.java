package com.github.kmruiz.workshops.domain.user;

public class UserImpl implements User, BanneableUser {

    private final String id;

    public UserImpl(String id) {
        this.id = id;
    }

    @Override
    public BannedUser ban() {
        return new BannedUserImpl(this.id);
    }
}
