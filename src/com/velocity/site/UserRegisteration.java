package com.velocity.site;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.velocity.project.Connectionjdbc;
import com.velocity.retrivedata.Orderbuacending;
import com.velocity.retrivedata.Retrivedatafromdatabase;


public class UserRegisteration  extends Registeration{
	Scanner sc= new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Retrivedatafromdatabase s=new Retrivedatafromdatabase();
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
				s.retrive();
				System.out.println("Login Successfully");
				break;
		      }
			else 
			{
		   System.out.println("Your Enter Incorrect User And Name Password");
		   break;
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

public void buy()
{
	System.out.println("Enter Product id to buy product ");
	String id=sc.next();
		
	System.out.println("Enter the Quantity");
	String  quantity = sc.next();
	try {
		Connectionjdbc connectionjdbc = new Connectionjdbc();
		con = connectionjdbc.getconnection();
		PreparedStatement ps= con.prepareStatement("select * from product");
		ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			 s.retrive();
				System.out.println("Product added successfully");
				
				}
		
}catch (Exception e) {
	
		e.printStackTrace();
	}
}

}
	

	
