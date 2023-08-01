package com.velocity.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class Connectionjdbc {
Connection connection=null;
	public Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertdata", "root", "root");	
		} catch (Exception e) {
			e.printStackTrace();
		}
			return connection;
	}

}
