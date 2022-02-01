package com.reliance.training.configclient.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.training.configclient.configuration.SpringConfiguration;

@RestController
public class OrderController {

	Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private SpringConfiguration config;

	@Value("${order.url:}")
	private String url;

	@Value("${order.item:}")
	private String item;

	@GetMapping("/order")
	public String getOrderProperty() {
		System.out.println("");
		return this.config.getItem();
	}
}
