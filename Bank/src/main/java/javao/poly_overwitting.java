package javao;

import org.testng.annotations.Test;

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class poly_overwitting_Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends poly_overwitting_Bank{  
int getRateOfInterest(){return 8;}  
}  

class ICICI extends poly_overwitting_Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends poly_overwitting_Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
	
public static void mainm(){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  
