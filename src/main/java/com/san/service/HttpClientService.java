package com.san.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClientService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	EmailService emailService;

	public void getData() {
		// final String uri = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByPin?pincode=110096&date=14-05-2021";
		String uri = "https://www.cowin.gov.in/home";
		String response = restTemplate.getForObject(uri, String.class);
		emailService.sendSimpleMessage("anilagrawal038@gmail.com", "sample mail from spring-boot-mail-utility", response);
	}

}
