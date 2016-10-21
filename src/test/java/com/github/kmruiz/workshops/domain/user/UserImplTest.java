package com.github.kmruiz.workshops.domain.user;

import com.github.kmruiz.workshops.domain.ad.Contact;
import com.github.kmruiz.workshops.domain.ad.ContactableAd;
import com.github.kmruiz.workshops.domain.ad.Interested;
import com.github.kmruiz.workshops.domain.ad.PublishedAdImpl;
import com.github.kmruiz.workshops.domain.ad.PublisherImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserImplTest {
    @Test
    public void contact() throws Exception {
        final Interested sut = new UserImpl("some-user");
        final ContactableAd ad = new PublishedAdImpl("some-ad-id", new PublisherImpl());

        final Contact contact = sut.contact(ad, "Hola!");

        Assert.assertNotNull(contact);
    }
}