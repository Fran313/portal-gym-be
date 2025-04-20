package com.portal.portal_gym_be;

import org.springframework.boot.SpringApplication;

public class TestPortalGymBeApplication {

	public static void main(String[] args) {
		SpringApplication.from(PortalGymBeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
