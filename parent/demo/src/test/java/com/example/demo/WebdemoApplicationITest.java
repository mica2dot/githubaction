package com.example.demo;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class WebdemoApplicationITest {

	@Test
	@Tag("fast")
	void contextLoads() {
	}

	@Test
	@Tag("fast")
	public void exampleTest2() {
		assertThat(true,is(NumberUtils.isDigits("1234567")));
		assertThat(5,is(5));
	}

	@Test
	@Tag("large")
	public void exampleTest3() {
		assertThat(true,is(NumberUtils.isDigits("1234567")));
		assertThat(4,is(4));
	}

}
