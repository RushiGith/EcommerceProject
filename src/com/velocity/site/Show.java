package com.velocity.site;
import java.util.Scanner;

import com.velocity.retrivedata.Orderbuacending;
import com.velocity.retrivedata.OrederbyDescinding;

public class Show  {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		while(true) {
		Orderbuacending obj=new Orderbuacending();
		OrederbyDescinding obj1 =new OrederbyDescinding();
		BuyProduct prod=new BuyProduct();
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
				System.out.println("Press 1 Ascending Order");
				System.out.println("Press 2 Decending Order");
				int userInput= s.nextInt();

				if(userInput==1)
				{
					System.out.println("**Sorted by Acending Order by Product Name**");
					obj.acending();
				}
				else if(userInput==2)
				{
					System.out.println("**Sorted by Decending Order by Product Name**");
					obj1.descending();
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
		else if(selectUser ==4)
		{
			System.out.println("Buy product");
			BuyProduct b= new BuyProduct();
			b.selection();
			//b.productBuyQuery(1, "IPhone", "2", "20000");
		}

		
	}
}
}