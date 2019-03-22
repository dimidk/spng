package com.kairos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Kairos {
	
	private String humidity;
	private String countryCode;
	
	public Kairos() {
		
	}
	
	public String getHumidity() {
		return humidity;
	}
	
	public void setHumidity(String humidity) {
		this.humidity=humidity;
	}
	
	public String getCountryCode() {
		return humidity;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode=countryCode;
	}
	
	
}
