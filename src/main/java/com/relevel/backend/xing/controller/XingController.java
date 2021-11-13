package com.relevel.backend.xing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XingController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

