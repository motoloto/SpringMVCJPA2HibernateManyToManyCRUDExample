package com.moto.spring.mvc.repositary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import com.moto.springmvc.repository.UserRepository;
import org.junit.Test;

import com.moto.springmvc.model.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest  {

    @Autowired
    UserRepository userRepository;

//	@Test
//    public void testGetUser() {
//		User user = em.find(User.class, 1);
//        assertNotNull(user);
//    }



//    @Test
//    public void testGetAll_success() {
//        List<User> users = em.createNamedQuery("User.getAll", User.class).getResultList();
//        assertEquals(1, users.size());
//    }
    @Test
    @Autowired
    public void testFindAll(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setFirstName("Peter");
        user.setLastName("Chung");
        user.setEmail("mt@gmail.com");
        user.setSsoId("902");
        user.setPassword("0000");
        user.setId(1L);
        users.add(user);
        assertEquals(users,userRepository.findAll());

    }

}
