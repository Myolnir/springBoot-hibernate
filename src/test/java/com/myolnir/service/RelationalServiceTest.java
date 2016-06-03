package com.myolnir.service;

import com.myolnir.SpringBootHibernateApplication;
import com.myolnir.model.User;
import com.myolnir.repository.RelationalRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringBootHibernateApplication.class})
@ActiveProfiles("test")
public class RelationalServiceTest {

    @Autowired
    RelationalService service;

    @Test
    public void whenSaveAndRetrieveFromDBThenReturnsData() {
        service.save(new User("testUser", "Usuario testing"));
        List<User> userList = service.findAll().orElse(Collections.EMPTY_LIST);
        assertNotEquals(null, userList);
        assertEquals("testUser", userList.get(0).getName());
        assertEquals("Usuario testing", userList.get(0).getComments());
    }

}
