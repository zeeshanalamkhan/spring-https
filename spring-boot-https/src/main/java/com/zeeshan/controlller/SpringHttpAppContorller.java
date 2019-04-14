package com.zeeshan.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHttpAppContorller {

	@GetMapping("/getData")
	public String getMessage() {
		return "<h2 style='color:red;text-align:center'>Accessed by HTTPS protocol</h2>";
	}
}
