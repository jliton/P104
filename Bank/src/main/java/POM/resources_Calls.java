package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class resources_Calls {
	 
 public static String  placePost() {
	
	 
	 String post="/maps/api/place/add/json";
	 
	  return post;
 }
 public static String  placeDelete() {

	 String de="/maps/api/place/delete/json";
	 
	  return de;
 }
}
