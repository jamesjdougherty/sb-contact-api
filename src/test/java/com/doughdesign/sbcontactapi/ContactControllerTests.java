package com.doughdesign.sbcontactapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ContactControllerTests {

    @Autowired
    ContactController contactController;

    @Test
    void returns_string() {
        List<String> result = contactController.getContacts();

        List<String> expected = new ArrayList<>();
        expected.add("**List of Contacts**");

        Assertions.assertEquals(expected, result);
    }
}
