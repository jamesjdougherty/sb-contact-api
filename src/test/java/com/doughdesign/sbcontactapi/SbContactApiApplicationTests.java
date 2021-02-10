package com.doughdesign.sbcontactapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbContactApiApplicationTests {

    @Autowired
    ContactController contactController;

    @Test
    void contextLoads() {
    }

    @Test
    void returns_string() {
        String result = contactController.getContacts();

        Assertions.assertEquals("**Contacts Endpoint works**", result);
    }
}
