package com.example.demosso;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoSsoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	/**
	 * 맴버가 있는지 확인하는 통합테스트
	 * @author 장성일
	 * @since 2018.11.24
	 * @throws Exception
	 */
	@Test
	public void contextLoads() throws Exception {
		Map<String, Object> params = new LinkedHashMap<>();
		params.put("id", "jasuil");
		
		@SuppressWarnings("unchecked")
		Map<String, ?> body = this.restTemplate.postForObject("/rest/logout", params, Map.class);
		assertThat(body.get("msg")).isEqualTo("ok");
		
	}

}
