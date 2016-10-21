package com.github.kmruiz.workshops.domain.user;

public class BannedUserImpl implements BannedUser {

    private final String id;

    public BannedUserImpl(String id) {
        this.id = id;
    }
}
