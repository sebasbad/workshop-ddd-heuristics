package com.github.kmruiz.workshops.domain.ad;

public class ContactImpl implements Contact {

    private final String message;

    public ContactImpl(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
