package javao;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switch_St {

	public static String Br = "Google";
	public static String st;

	@Test
	public static void Con() {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		st = driver.getTitle();
		
if (st.matches(Br)) {
	
	System.out.println("Tittle="+ st);
	
}
driver.close();
}
	

	}
