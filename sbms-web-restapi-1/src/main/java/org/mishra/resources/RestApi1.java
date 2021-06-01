package org.mishra.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api1")
public class RestApi1 {
	@GetMapping("/welcome")
	public String welcomeMessage() {
		String msg="Welcome To Mishra Group!!";
		return msg;
	}
}
