package com.qinkuai.msdconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qinkuai.msdconsumer.providerservice.ProviderService;

@RestController
public class ConsumerController {
	@Autowired
	private ProviderService providerService;
	
	@RequestMapping(value = "getConsumer")
	public String getConsumer() {
		return providerService.getProvider();
	}
}
