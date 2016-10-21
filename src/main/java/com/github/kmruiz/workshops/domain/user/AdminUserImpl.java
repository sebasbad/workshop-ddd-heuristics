package com.github.kmruiz.workshops.domain.user;

public class AdminUserImpl extends UserImpl implements Admin {

    public AdminUserImpl(String id) {
        super(id);
    }

    @Override
    public BannedUser ban(User user) {
        return user.ban();
    }

    @Override
    public BannedUser ban() {
        throw new IllegalStateException();
    }
}
