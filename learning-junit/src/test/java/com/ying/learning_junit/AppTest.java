package com.ying.learning_junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfiguration.class)
// @WebAppConfiguration
@WebIntegrationTest("server.port:8080")
public class AppTest{

	@Test
	public void signInTest() {
		RestTemplate template = new TestRestTemplate();
		String url = "http://127.0.0.1:8080/user/sign_in/ying";
		String result = template.getForObject(url, String.class);
		System.out.println("test result:" + result);
		assertNotNull(result);
		assertThat(result, Matchers.containsString("Tom"));
	}
}
