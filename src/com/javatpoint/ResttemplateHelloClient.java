package com.javatpoint;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.test.common.Employee;
import com.test.common.EmployeeListVO;

public class ResttemplateHelloClient {

	public static void main(String args[]) {
		/*
		 * final String uri = "http://localhost:8080/SpringMVC/hello/sekhar";
		 * RestTemplate restTemplate = new RestTemplate(); String result =
		 * restTemplate.getForObject(uri, String.class); HttpHeaders headers =
		 * new HttpHeaders();
		 * headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 * HttpEntity<String> entity = new HttpEntity<String>("parameters",
		 * headers); ResponseEntity<String> result = restTemplate.exchange(uri,
		 * HttpMethod.GET, entity, String.class);
		 */

		/*
		 * final String uri = "http://localhost:8080/SpringMVC/hello/add";
		 * RestTemplate restTemplate = new RestTemplate(); Employee employee=new
		 * Employee(); employee.setId("1"); employee.setId("Sekhar"); Employee
		 * result = (Employee) restTemplate.postForObject(uri,employee,
		 * Employee.class); System.out.println("result:"+result.toString());
		 */

		/*final String uri = "http://localhost:8080/SpringMVC/hello/id/1";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		Employee result = restTemplate.getForObject(uri, Employee.class);
		System.out.print(result);*/
		
		final String uri = "http://localhost:8080/SpringMVC/employees";
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		EmployeeListVO result = restTemplate.getForObject(uri, EmployeeListVO.class);
		System.out.print(result);

	}

}
