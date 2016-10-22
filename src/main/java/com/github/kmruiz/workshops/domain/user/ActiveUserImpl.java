package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.Contact;
import com.github.kmruiz.workshops.domain.ad.ContactableAd;

public class ActiveUserImpl implements ActiveUser {

    private final String id;

    public ActiveUserImpl(String id) {
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
