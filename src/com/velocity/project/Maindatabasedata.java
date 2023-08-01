package com.velocity.project;

import java.util.Scanner;

public class Maindatabasedata extends UserInput{

	public void insertproduct() {
			Scanner sc= new Scanner(System.in);
	for(int i=0;i<=10;i++)
		{
			System.out.println("Enter discription");
			String discription=sc.next();
			
			System.out.println("Enter Product name");
			String productname=sc.next();
			
			System.out.println("Enter price");
			int price=sc.nextInt();
		
			System.out.println("Enter quantity");
			int quantity=sc.nextInt();
			Maindatabasedata user=new Maindatabasedata();
			user.insertproductdata(discription, productname, price, quantity);
			}
	sc.close();
	}
}
