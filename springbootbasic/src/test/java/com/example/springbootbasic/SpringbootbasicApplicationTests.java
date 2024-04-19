package com.example.springbootbasic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springbootbasic.controller.HelloController;

@SpringBootTest
class SpringbootbasicApplicationTests {

	@Autowired
	HelloController helloCntrl;
	
	@Test
	void contextLoads() {
		assertThat(helloCntrl).isNotNull();
	}

}
