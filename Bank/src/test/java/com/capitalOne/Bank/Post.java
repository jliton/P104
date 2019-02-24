package com.capitalOne.Bank;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Post {
	
	@BeforeTest
	public void getData() {
		
		Properties pro=new Properties();
		pro.get("");
		
		
		
	}
	
	
	
	
	
	
@Test
public void Creating_Place() {
	String PayLoad="{"+
			  "\"location\": {"+
			    "\"lat\": -33.8669710,"+
			    "\"lng\": 151.1958750"+
			  "},"+
			  "\"accuracy\": 50,"+
			  "\"name\": \"Google Shoes!\","+
			  "\"phone_number\": \"(01) 9374 4000\","+
			  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
			  "\"types\": [\"shoe_store\"],"+
			  "\"website\": \"http://www.google.com.au/\","+
			  "\"language\": \"en-AU\""+
			"}";
	
	RestAssured.baseURI="http://216.10.245.166";
	Response res=given().queryParam("key","qaclick123").body(PayLoad). 
	when().
	    post("/maps/api/place/add/json").
	then().
	
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status",equalTo("OK")).extract().response();

  String  ResponseString= res.asString();
  System.out.println(ResponseString);
//Task converting to json
  JsonPath js=new JsonPath(ResponseString);
  String PlaceId=js.get("place_id");
  System.out.println(PlaceId);
  //deleting 
  
  
  RestAssured.baseURI="http://216.10.245.166";
	given().queryParam("key","qaclick123").
	
	body("{"+"\"place_id\":\""+PlaceId+"\"}"). 
	when().
	    post("/maps/api/place/delete/json").
	then().
	
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status",equalTo("OK"));
  
}
	
	
}

