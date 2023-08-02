package com.velocity.site;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.velocity.project.Connectionjdbc;

public class Registeration {

	PreparedStatement prs=null;
	Connection con=null;
	public void registeration(String firstname,String lastname,String username,String password ,String city,String Emailid,Long Mobileno){
		try {
		Connectionjdbc connect= new Connectionjdbc();
	     con = connect.getconnection();
	      PreparedStatement prs = con.prepareStatement("insert into userregistration(firstname,lastname,username,password,city,Emailid,Mobileno)values(?,?,?,?,?,?,?)");
	      prs.setString(1, firstname);
	      prs.setString(2, lastname);
	      prs.setString(3, username);
	      prs.setString(4, password);
	      prs.setString(5, city);
	      prs.setString(6, Emailid);
	      prs.setLong(7, Mobileno);
	      int i = prs.executeUpdate();
	      System.out.println("Record Is Added Successfully"+i);
	     // con.close();
	      prs.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
