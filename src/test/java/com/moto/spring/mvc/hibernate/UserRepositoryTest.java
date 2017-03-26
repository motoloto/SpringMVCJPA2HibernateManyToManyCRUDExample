package com.moto.spring.mvc.hibernate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.moto.springmvc.model.User;

public class UserRepositoryTest extends JPAHibernateTest {
	@Test
    public void testGetUser() {
		User user = em.find(User.class, 1);
        assertNotNull(user);
    }

//    @Test
//    public void testGetAll_success() {
//        List<User> users = em.createNamedQuery("User.getAll", User.class).getResultList();
//        assertEquals(1, users.size());
//    }    

}
