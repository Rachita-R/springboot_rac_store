package com.rachitaspringboot.rac_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RacStoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(RacStoreApplication.class, args);
		ApplicationContext context = SpringApplication.run(RacStoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
