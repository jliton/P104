package javao;

import org.testng.annotations.Test;

class Student{  
int rollno;  
String name;  
float fee;  
int LocalVariable=30;
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
};