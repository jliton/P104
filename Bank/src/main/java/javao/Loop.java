package javao;

import org.testng.annotations.Test;

public class Loop {
	@Test
public static void Looping() {
	int i=10;
	
	int k=10;
	int l=22;
	
	int arr[]= {600,2,3,46,5,6,76,8,9,0};
	
	for(i=1;i<=10;i++) {
		System.out.println(i+",");
		
		
	       
	     
		
		
	}
	System.out.println("...........");
	for( int j: arr) {    //for-each loop is used to traverse array or collection in java
		System.out.println(j);
		
		
		
	}
//while(condition) and value value ok k may be unknown

	System.out.println("...........");
	  while(k<=10){  
	        System.out.println(k);  
	    k++;  
	    
	  }  
	
	//Declaring a variable for switch expression  
	    int number=10;  
	    //Switch expression  
	    switch(number){  
	    //Case statements  
	    case 10: System.out.println("10");  
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	    
	    
	    
	    
	    
	    
	   System.out.println("...........");
	    do{  
	        System.out.println(l);  
	    l++;  
	    }while(l<=24);  
	}  
	
	}

	

	

	

	

