package com.qinkuai.msdconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	@Value("${springcloud.hello}")
	private String hello;
	
	@RequestMapping("/hello")
	public String from() {
		return hello;
	}
}