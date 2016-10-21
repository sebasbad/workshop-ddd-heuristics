package com.github.kmruiz.workshops.domain.user;

public interface BanneableUser extends User {
    BannedUser ban();
}
