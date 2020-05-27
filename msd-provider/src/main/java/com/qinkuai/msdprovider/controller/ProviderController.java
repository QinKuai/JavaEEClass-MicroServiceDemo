package com.qinkuai.msdprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qinkuai.msdentity.Provider;

@RestController
public class ProviderController {
	@RequestMapping(value = "getProvider")
	public String getProvider() {
		return new Provider().toString();
	}
}
