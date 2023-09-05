package com.gl.email.main;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.CredentialService;
import com.gl.email.service.CredentialServiceImpl;

public class EmailApp {
	
	 public static void main(String[]args) {
   	  CredentialService service=new CredentialServiceImpl();
   	  Scanner sc=new Scanner(System.in);
   	  
   	  System.out.println("Enter the first name");
   	  String fn=sc.next();
   	  System.out.println("Enter the last name");
   	  String ln=sc.next();
   	 
   	  Employee employee=new Employee(fn,ln);
   	  System.out.println("Please enter the department from the following");
   	  System.out.println("1.Technical");
   	  System.out.println("2.Admin");
   	  System.out.println("3.Human Resource");
   	  System.out.println("4.Legal");
   	  
   	  int option=sc.nextInt();
   	  
   	  String department="";
   	  switch(option) {
   	  case 1:
   		  department="tech";
   		  break;
   	  case 2:
   		  department="ad";
   		  break;
   	  case 3:
   		  department="Hr";
   		  break;
   	  case 4:
   		  department="lg";
   		  break;
   		  default:
   			  System.out.println("please Enter correct choice!!!!");
   			  break;
   		  
   	  }
   	 String email=service.generateEmailAddress(fn, ln, department)	; 
   	 employee.setEmail(email);
   	String password=service.generatePassword();
   	employee.setPassword(password);
   	service.showCredentials(employee);
   	 }
}
   	  
   	  /*String password=service.generatePassword();
   	  System.out.println(password);
   	  String email=service.generateEmailAddress(ln, password, dept);
   	  Employee emp=new Employee(fn,ln);
   	  emp.setEmail(email);
   	  emp.setPassword(password);
   	  service.showCredentials(emp);
   	  
   	  
     }
}*/

//}
