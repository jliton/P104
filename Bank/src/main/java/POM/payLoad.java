package POM;

public class payLoad {
public String name="Google Shoes";
	public static String PL(String name) {
		
		String PayLoad="{"+
				  "\"location\": {"+
				    "\"lat\": -33.8669710,"+
				    "\"lng\": 151.1958750"+
				  "},"+
				  "\"accuracy\": 50,"+
				  "\"name\": \""+name+"!\","+
				  "\"phone_number\": \"(01) 9374 4000\","+
				  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+
				  "\"types\": [\"shoe_store\"],"+
				  "\"website\": \"http://www.google.com.au/\","+
				  "\"language\": \"en-AU\""+
				"}";
		
		
		return PayLoad;
		
	}
	
	
	
}
