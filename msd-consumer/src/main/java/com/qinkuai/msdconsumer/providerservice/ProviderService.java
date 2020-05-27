package com.qinkuai.msdconsumer.providerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider-server", path = "/provider")
@Component
public interface ProviderService {
	@RequestMapping(value = "getProvider")
	String getProvider();
}
