package com.velocity.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collection;

public class UserInput {

	PreparedStatement prs=null;
	Connection con=null;
	public void insertproductdata(String discription,String productname,Integer price,Integer quantity) {
		try {
		Connectionjdbc connect= new Connectionjdbc();
	     con = connect.getconnection();
	      PreparedStatement prs = con.prepareStatement("insert into product(discription,productname,price,quantity)values(?,?,?,?)");
	      prs.setString(1, discription);
	      prs.setString(2, productname);
	      prs.setInt(3, price);
	      prs.setInt(4, quantity);
	      int i = prs.executeUpdate();
	      System.out.println("Record Is Added Successfully"+i);
	     // con.close();
	      prs.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
