package com.peter;

import java.util.Scanner;

import com.peter.model.Account;
import com.peter.model.User;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long randomId = randomIdGenerator(); 
		String firstName;
		String lastName;
		double balance = 50.00;
		

		
		
		System.out.println("Welcome to United Bank Corp");
		System.out.println("If you sign up for a basic account, we will provide you with $50.00.");
		System.out.println();
		System.out.println("Would you like to enroll, Y or N?");
		String response = scanner.nextLine();
		if (response.startsWith("Y")) {
			System.out.println("Enter your First Name");
			firstName = scanner.nextLine();
			System.out.println();
			System.out.println("Enter your Last Name");
			lastName = scanner.nextLine();
			System.out.println();
			User user = new User(randomId, firstName, lastName, new Account(randomId, balance));
			System.out.println(user.toString());
			
			
		} else {
			System.out.println("Only current account holders have access");
		}
		
				

	}
	
	public static long randomIdGenerator() {
		long max= 1000000;
		long min = 1;
		return (long) (Math.random() * ( max - min) + min);
	}

}
