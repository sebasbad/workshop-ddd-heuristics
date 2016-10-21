package com.github.kmruiz.workshops.domain.user;

public class AdminUserImpl implements Admin {

    private final String id;

    public AdminUserImpl(String id) {
        this.id = id;
    }

    @Override
    public BannedUser ban(BanneableUser user) {
        return user.ban();
    }
}
