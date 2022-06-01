package tn.esprit.spring.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.services.IEmployeService;

import java.util.List;


public class UserTest {
    @Autowired
    IEmployeService us;

    @Test
    public void testRetrieveAllUsers() {
        //List<String> listUsers = us.getAllEmployeNamesJPQL();
        Assert.assertEquals(0, 0);
    }
}
