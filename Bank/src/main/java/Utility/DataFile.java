package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class DataFile {
	
	public static Properties Data;
	
	public static FileInputStream fis;

	public static void ReadingDataFile () throws IOException  {
	  
	
		 Data = new Properties();

		// LoadingFile
	

			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\Utility\\Env.properties");
			Data.load(fis);

		}
	  
	
  }
	
	

