package com.github.kmruiz.workshops.domain.ad;

public class PublishedAdImpl implements ContactableAd {

    private final String id;
    private final Publisher publisher;


    public PublishedAdImpl(String id, Publisher publisher) {
        this.id = id;
        this.publisher = publisher;
    }

    @Override
    public Contact contact(String message) {
        return publisher.contact(message);
    }
}
