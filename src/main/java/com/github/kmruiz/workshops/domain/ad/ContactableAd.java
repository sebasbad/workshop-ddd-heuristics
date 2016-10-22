package com.github.kmruiz.workshops.domain.ad;

public interface ContactableAd extends Ad {
    Contact contact(String message);
}
