package com.velocity.site;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.velocity.project.Connectionjdbc;
import com.velocity.retrivedata.Retrivedatafromdatabase;


public class UserRegisteration  extends Registeration{
	Scanner sc= new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
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
		long Mobileno=sc.nextLong();
		
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
		Connectionjdbc connectionjdbc = new Connectionjdbc();
		con = connectionjdbc.getconnection();
		PreparedStatement ps= con.prepareStatement("select * from userregistration");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if(rs.getString(4).equals(username)&&(rs.getString(5).equals(password))) {
				System.out.println("Login Successfully");
				}
			else {
		System.out.println("Your Enter Incorrect User Name Password");
			}
		}
}catch (Exception e) {
	
		e.printStackTrace();
	}
}

public void getdata() {
	Retrivedatafromdatabase s=new Retrivedatafromdatabase();
	s.retrive();
	
}
}
	

	
