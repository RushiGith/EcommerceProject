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
			System.out.print("ID="+set.getInt(1));
			System.out.print(" || ");
			System.out.print("discription="+set.getString(2));
			System.out.print(" || ");
			System.out.print("productname="+set.getString(3));
			System.out.print(" || ");
			System.out.print("price="+set.getInt(4));
			System.out.print(" || ");
			System.out.println("quantity="+set.getInt(5));
			System.out.println("------------------------------------------------");
		}
		con.close();
		prs.close();
		set.close();
	} catch (Exception e) {
		e.getStackTrace();
	}
	
}
	
}

