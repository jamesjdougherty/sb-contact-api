package com.doughdesign.sbcontactapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ContactController {

    @CrossOrigin
    @GetMapping("/contacts")
    @ResponseBody
    List<String> getContacts() {
        List<String> contacts = new ArrayList<>();
        contacts.add("**List of Contacts**");

        return contacts;
    }

    @CrossOrigin
    @GetMapping("/contacts/{name}")
    @ResponseBody
    String getContact(@PathVariable String name) {
        Contact contact = new Contact();
        contact.setName(name);

        return contact.getName();
    }
}
