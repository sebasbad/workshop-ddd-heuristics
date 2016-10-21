package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.Contact;
import com.github.kmruiz.workshops.domain.ad.ContactableAd;
import com.github.kmruiz.workshops.domain.ad.Interested;

public class UserImpl implements User, BanneableUser, Interested {

    private final String id;

    public UserImpl(String id) {
        this.id = id;
    }

    @Override
    public BannedUser ban() {
        return new BannedUserImpl(this.id);
    }

    @Override
    public Contact contact(ContactableAd ad, String message) {
        return ad.contact(message);
    }
}
