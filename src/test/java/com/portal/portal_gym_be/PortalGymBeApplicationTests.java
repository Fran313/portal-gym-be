package com.portal.portal_gym_be;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class PortalGymBeApplicationTests {

	@Test
	void contextLoads() {
	}

}
