package com.capitalOne.Bank;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class WeatherApi {
@Test
public void Weather () {
	
	RestAssured.baseURI="https://samples.openweathermap.org";
	given().
		 param("q","London,uk").
		 param("appid","b6907d289e10d714a6e88b30761fae22").
		 
	when().
	    get("/data/2.5/weather").
	then().
	
	assertThat().statusCode(200).and().contentType(ContentType.JSON);
	 
	
}
	
	
}
