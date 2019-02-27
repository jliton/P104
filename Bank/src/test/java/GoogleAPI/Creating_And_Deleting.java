package GoogleAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

import POM.payLoad;
import POM.resources_Calls;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Creating_And_Deleting {
	Properties pro = new Properties();

	// LoadingFile
	@BeforeTest
	public void getData() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\File\\Env.properties");
		pro.load(fis);

	}

	@Test

//Creating
	public void Creating_Deleting_Place() {

		RestAssured.baseURI = pro.getProperty("Host");
		Response res = given().queryParam("key", pro.getProperty("key")).body(payLoad.PL("name")).
		// resources
				when().post(resources_Calls.placePost()).

				// Response validation
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and()
				.body("status", equalTo("OK")).extract().response();

		String ResponseString = res.asString();
		//System.out.println("Before code:" + ResponseString);

		// Task converting to json
		JsonPath js = new JsonPath(ResponseString);
		String PlaceId = js.get("place_id");
		//System.out.println("After Code: " + PlaceId);
		
		HashMap<String, String> cap = new HashMap<String, String>();
		cap.put("ID", PlaceId);
      
		// DeletingPLace

		RestAssured.baseURI = pro.getProperty("Host");
		given().queryParam("key", pro.getProperty("key")).

				body("{" + "\"place_id\":\"" + cap.get("ID") + "\"}").when().
				post(resources_Calls.placeDelete()).
                then().
                assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status", equalTo("OK"));

	}

}
