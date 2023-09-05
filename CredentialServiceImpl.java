package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {
  
	String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small_Chars="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String symbols="!@#$%^&*_=+>/.?< >";
	String values=capital_chars+small_Chars+numbers+symbols;	
	

@Override
public String generateEmailAddress(String firstName, String lastName, String department) {
	return firstName.toLowerCase()+lastName.toLowerCase()+ "@"+department +".gl.in";
}

@Override
public String generatePassword() {
	String values=capital_chars+small_Chars+numbers+symbols;
	//using random method
	Random random=new Random();
	char[] password=new char[16];
	for(int i=0;i<password.length;i++) {
		password[i]=values.charAt(random.nextInt(values.length()));
	}

	return String.valueOf(password);
}

@Override
public void showCredentials(Employee employee) {
	System.out.println("Dear"+employee.getFirstName()+" Your generated credential");
	System.out.println("Email\t\t" +employee.getEmail());
	System.out.println("password\t" +employee.getPassword());
	
	
}
}
