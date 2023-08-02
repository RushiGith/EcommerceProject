package com.velocity.site;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class UserRegisteration  extends Registeration{
	Scanner sc= new Scanner(System.in);
public void registerdata() {
	
	{
		System.out.println("Enter firstname");
		String fisrtname=sc.next();

		System.out.println("Enter lastname");
		String lastname=sc.next();

		System.out.println("Enter username");
		String username=sc.next();

		System.out.println("Enter password");
		String password=sc.next();
		
		System.out.println("Enter city");
		String city=sc.next();
		
		System.out.println("Enter Emilid");
		String Emailid=sc.next();
				
		System.out.println("Enter Mobile no");
		int Mobileno=sc.nextInt();
		
		UserRegisteration reguser=new UserRegisteration();
		reguser.registeration(fisrtname, lastname, username, password,city,Emailid,Mobileno);
	}
	
}

public void userLogin() {
	System.out.println("Enter User Name");
	String username=sc.next();
	System.out.println("Enter Password");
	String password=sc.next();
	try {
		PreparedStatement prs= con.prepareStatement("select * from userregistration");
		ResultSet set = prs.getResultSet();
		while(set.next()) {
			if(set.getString(4).equals(username)&&(set.getString(5).equals(password))) {
				System.out.println("Login Successfully");
			}
		}
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
	
}
	
