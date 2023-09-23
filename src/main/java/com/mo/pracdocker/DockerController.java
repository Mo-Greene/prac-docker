package com.mo.pracdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping("")
	public String hello() {
		return "version 0.0.1";
	}
}
