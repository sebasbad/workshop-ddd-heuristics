package com.github.kmruiz.workshops.domain.ad;

public class PublisherImpl implements Publisher {

    @Override
    public Contact contact(String message) {
        return new ContactImpl(message);
    }
}
