package com.velocity.site;
import java.util.Scanner;

public class Show {
public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	System.out.println("-----------Wlecome to Ecommerce Application-------------   ");
	System.out.println("========================================================");
	
	System.out.println("1=User Registeration                    2=User Login");
	System.out.println("-----------------------------------------------------");
	
	System.out.println("3=User View Product                     4=Buy Product");
	System.out.println("-----------------------------------------------------");
	System.out.println("5=View Cart                             6=Purchase Item");
	System.out.println("-----------------------------------------------------");
	
	System.out.println("Select User");
	System.out.println("-----------------------------------------------------");
    int selectUser=s.nextInt();
	
	UserRegisteration reg =new UserRegisteration();
	if(selectUser == 1)
	{
		//String userregisteration=s.next();
		System.out.println("User Registeration");
		reg.registerdata();
	}
	else if(selectUser ==2)
	{
	  System.out.println("User Login");
	  reg.userLogin();
	
	}
	
	else if(selectUser==3)
	{
	
	System.out.println("User View Product");
	reg.getdata();
	}
	
	
	
	
//	
//		Integer View=2;
//		switch(View) {
//case 1:
//	String userregisteration=s.next();
//	System.out.println("User Registeration");
//	reg.registerdata();
//	break;
//case 2:
//	String userlogin=s.next();
//	System.out.println("User Login");
//	break;
//case 3:
//	String userView=s.next();
//	System.out.println("User View");
//	break;
//case 4:
//	String buyproduct=s.next();
//	System.out.println("Buy Product");
//	break;
//case 5:
//	String viewcart=s.next();
//	System.out.println("View Cart");
//	break;
//case 6:
//	String purchaseitem=s.next();
//	System.out.println("Purchase item");
//	break;
//	default:
//		System.out.println("out Of Selection");
//	}
}
}