package com.velocity.mini;

import java.util.Scanner;

public class Username extends Login{

	@Override
	void username() {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter Username");
		String username=x.next();
		System.out.println("User name is="+username);
	}

	@Override
	void password() {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter password");
		String password=x.next();
		System.out.println("Password is="+password);
	}
	

}
