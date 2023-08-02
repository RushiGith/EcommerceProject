package com.velocity.retrivedata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.velocity.project.*;
public class Retrivedatafromdatabase{
public void retrive() {
	try {
		Connectionjdbc retrive= new Connectionjdbc();
		Connection con = retrive.getconnection();
		PreparedStatement prs = con.prepareStatement("select*from product");
		ResultSet set = prs.executeQuery();
		while(set.next()) {
			System.out.println("ID="+set.getInt(1));
			System.out.println("discription="+set.getString(2));
			System.out.println("productname="+set.getString(3));
			System.out.println("price="+set.getInt(4));
			System.out.println("quantity="+set.getInt(5));
		}
		con.close();
		prs.close();
		set.close();
	} catch (Exception e) {
		e.getStackTrace();
	}
	
}
	
}

