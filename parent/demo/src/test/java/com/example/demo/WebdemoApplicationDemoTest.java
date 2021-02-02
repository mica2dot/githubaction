package com.example.demo;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class WebdemoApplicationDemoTest {



	@Test
	public void exampleTest2() {
		Public p = Public.builder().abc2(2222).build();
		System.out.println(p);

		assertThat(true,is(NumberUtils.isDigits("1234567")));
		assertThat(5,is(5));
	}

}
