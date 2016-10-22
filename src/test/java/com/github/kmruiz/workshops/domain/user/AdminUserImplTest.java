package com.github.kmruiz.workshops.domain.user;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminUserImplTest {

    @Test
    public void shouldPermitBanSomeUser() throws Exception {
        final AdminUserImpl sut = new AdminUserImpl("some-admin");
        final ActiveUser user = new ActiveUserImpl("some-user");

        final BannedUser actual = sut.ban(user);

        Assert.assertNotNull(actual);
    }
}