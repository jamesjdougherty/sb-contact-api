package com.doughdesign.sbcontactapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

    @GetMapping("/contacts")
    @ResponseBody
    String getContacts() {
        return "**Contacts Endpoint works**";
    }

}
