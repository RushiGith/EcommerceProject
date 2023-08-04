package com.velocity.retrivedata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.velocity.project.Connectionjdbc;
public class OrederbyDescinding {
	public void descending() {
		
				try {
					Connectionjdbc retrive= new Connectionjdbc();
					Connection con = retrive.getconnection();
					PreparedStatement prs = con.prepareStatement("select id,productname,price,discription from insertdata.product order by productname desc limit 0,10");
					ResultSet set = prs.executeQuery();
					while(set.next()) {
					
						System.out.print("Product id = "+set.getInt(1));
						System.out.print("  || ");
						System.out.print("Product Name="+set.getString(2));
						System.out.print("  ||   ");                                
						System.out.print("Price="+set.getDouble(3));
						System.out.print("  ||   ");
						System.out.println("Discription="+set.getString(4));
						System.out.println("-----------------------------------------------------------------------------------------------------------------");   
					
					}
					con.close();
					prs.close();
					set.close();
				} catch (Exception e) {
					e.getStackTrace();
				}
				
			}
				
			}





