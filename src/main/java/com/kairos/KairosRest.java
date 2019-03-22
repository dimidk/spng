package com.kairos;

import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.kairos.Kairos;

@Service
public class KairosRest {
	
	private RestTemplate rest;
	
	/*?north=44.1&south=-9.9&east=-22.4&west=55.2&username=ferryscanner";*/
	
	private String callUrl1="https://api.geonames.org/weatherJSON";
	
	private String north="10";
	private String south="44";
	private String west="22";
	private String east="35";
	private String username="ferryscanner";
	
	private String URI = UriComponentsBuilder.newInstance()
		      .scheme("https").host("api.geonames.org").pathSegment("weatherJSON")
		      .queryParam("north", north)
		      .queryParam("south",south)
		      .queryParam("west",west)
		      .queryParam("east",east)
		      .queryParam("username",username)
		      .build(). toUriString();
	
	public KairosRest(RestTemplateBuilder restTemplateBuilder) {
		this.rest=restTemplateBuilder.build();
	}
	
	public Kairos getTheUrl() {
		
		Kairos resultHttp=rest.getForObject(URI, Kairos.class);
		System.out.print("I finally done it");
		return resultHttp; 
	}
	
}
