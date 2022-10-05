package com.example.students.clientcalls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class PlacementDetails {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void getPalcementDetails(int enrollId) {
		
		List placement = this.restTemplate.getForObject("http://localhost:9000/Placementservice/student/" + enrollId, List.class);
		System.out.println("method called : " + placement);		
	}
	
	

}
