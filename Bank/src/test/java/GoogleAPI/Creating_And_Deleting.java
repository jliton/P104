package GoogleAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import POM.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Creating_And_Deleting {
	Properties pro = new Properties();

	// LoadingFile
	@BeforeTest
	public void getData() throws IOException {

		
		  
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\File\\Env.properties");
		pro.load(fis);

	}

	@Test

//creating
	public void Creating_Place() {

		RestAssured.baseURI = pro.getProperty("Host");
		Response res = given().queryParam("key", pro.getProperty("key")).body(payLoad.PL()).when()
				.post(resources.placePost()).then().

				assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"))
				.extract().response();

		String ResponseString = res.asString();
		System.out.println(ResponseString);

		// Task converting to json
		JsonPath js = new JsonPath(ResponseString);
		String PlaceId = js.get("place_id");
		System.out.println(PlaceId);

		// deletingPLace

		RestAssured.baseURI = pro.getProperty("Host");
		given().queryParam("key", pro.getProperty("key")).

				body("{" + "\"place_id\":\"" + PlaceId + "\"}").when().post(resources.placeDelete()).then().

				assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"));

	}

}
