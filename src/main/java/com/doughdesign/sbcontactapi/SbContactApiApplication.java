package com.doughdesign.sbcontactapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SbContactApiApplication {

	@GetMapping("/contacts")
	@ResponseBody
	String getContacts() {
		return "**Contacts Endpoint works**";
	}

	public static void main(String[] args) {
		SpringApplication.run(SbContactApiApplication.class, args);
	}

}
