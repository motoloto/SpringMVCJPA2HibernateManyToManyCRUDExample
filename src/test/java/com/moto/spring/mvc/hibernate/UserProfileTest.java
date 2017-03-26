package com.moto.spring.mvc.hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.moto.springmvc.model.UserProfile;

public class UserProfileTest extends JPAHibernateTest {
	@Test
    public void testGetUserProfileType() {
		UserProfile userProfile = em.find(UserProfile.class, 1);
        assertNotNull(userProfile);
    }   

}
