package com.velocity.site;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.velocity.project.GetSetData;

import com.velocity.retrivedata.Retrivedatafromdatabase;

public class BuyProduct  {

	Scanner sc= new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	private static int total = 0;
	Retrivedatafromdatabase s=new Retrivedatafromdatabase();
	List<GetSetData> proddetails;
	BuyProduct b;
	
	public void selection() {
		String choice;int count=0;
		do {
			System.out.println("Want To Buy ?(Yes/No)");
			choice = sc.nextLine();
			if (choice.equalsIgnoreCase("yes")) {

				System.out.println("Please Enter Product Name >> ");
				String productname = sc.nextLine();
				List<GetSetData> proddetails = getProductDetails();

				if (proddetails == null) {
					System.out.println("Database fetching problem..");
				} else {

					for (GetSetData prod : proddetails) {
						if (prod.getProductname().equalsIgnoreCase(productname)) {
							int remqty = 0;count++;
							System.out.println("Product Name >> " + prod.getProductname());
							System.out.println("Product Discription >> " + prod.getDiscription());
							System.out.println("Product Price >> " + prod.getPrice());
							System.out.println("Product Quantity >> " + prod.getQuantity());

							System.out.println("\nEnter " + prod.getProductname() + " Quantity >> ");
							int qty = sc.nextInt();// 2
							sc.nextLine();
							if (qty >= 0 && prod.getQuantity() > 0) {// 6
								remqty = prod.getQuantity() - qty;
								total += qty * prod.getPrice();
								System.out.println("Remaining " + prod.getProductname() + "Quantity >>" + remqty);
								System.out.println(
										"Total Amout for " + prod.getProductname() + " is >>" + prod.getPrice() * qty);
							} else {
								System.out.println("out of stock !!");
							}
//							boolean qtyresult = ecomrepo.isUpdatedQuantity(prod.getProductid(), remqty);
//							if (qtyresult) {
//								System.out.println("database updated ..");
//							} else {
//								System.out.println("database not updated ..");
//							}
//							break;
						} //else {
						//	System.out.println("problem in result..");
							
						//}
					}
					if(count==0)
						System.out.println("product not in table ..");

				}
			}
		} while (choice.equalsIgnoreCase("yes"));
	}
	public void TotalBill() {
		System.out.println("Gross Total of purchasing is >>"+ total);
	}
	
	
	
	public List<GetSetData> getProductDetails() {
		// TODO Auto-generated method stub
		try {
			proddetails = new ArrayList<GetSetData>();
			ps = con.prepareStatement("select * from product order by productname");
			rs = ps.executeQuery();
			while(rs.next()) {
				GetSetData pdetails = new GetSetData();
				pdetails.setId(rs.getInt(1));
				pdetails.setDiscription(rs.getString(2));
				pdetails.setProductname(rs.getString(3));
				pdetails.setPrice(rs.getInt(4));
				pdetails.setQuantity(rs.getInt(5));
				proddetails.add(pdetails);
			} 
		} catch (Exception e) {
			System.out.println("Error is" + e);
			return proddetails=null;
		}
		return proddetails;
	}
	
	
	
	
	
	
	
//	public void productUI()
//	{
//		System.out.println("Enter Product id to buy product ");
//		//int id=sc.nextInt();
//		String productname= sc.next();
//		
//		System.out.println("Enter the Quantity");
//		String quantity=sc.next();
//		
////		System.out.println("Do you want to view Cart(yes/no");
////		String dec=sc.next();
//	
//			try {
//				Connectionjdbc connectionjdbc = new Connectionjdbc();
//				con = connectionjdbc.getconnection();
//				PreparedStatement ps= con.prepareStatement("select * from product");
//				ResultSet rs = ps.executeQuery();
//				while(rs.next()) {
//					String sql="SELECT 'id','productname','quantity','price' FROM 'product'where'id'=?";
//					
//					//if(rs.getString(3).equals(productname)&&(rs.getString(5).equals(quantity))) {
//				 s.retrive();
//						System.out.println("Product item has been added to cart"); 
//					break;
//					}
//				
//				//else
//				{
//				    System.out.println("Not added");
//				// break;
//					}
//				//}
//		}
//	catch (Exception e) {
//			
//				e.printStackTrace();
//			}
//		
//	}
	
	
}	
	
