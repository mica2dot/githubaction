package com.example.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void exampleTest() {
		assertThat(2,is(2));
	}

	@Test
	public void exampleTest2() {
		assertThat(3,is(3));
	}

}
