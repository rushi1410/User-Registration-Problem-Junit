package com.bridgelabz;

import java.util.Scanner;
public class UserValidation extends UserRegistration {
	public void SelectOption() {
		while (true) {

			System.out.println("1. FirstName\n"+"2. LastName\n"+"3. Email\n"+"4. Mobile Number\n"+"5. Password\n"+"6. Exit\n");
			System.out.println("Enter option to check for Validation");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Enter your first name");
				String FirstName = sc.next();
				firstNameValidation(FirstName);
				break;
			case 2:
				System.out.println("Enter your Last name");
				String lastName = sc.next();
				lastNameValidation(lastName);
				break;
			case 3:
				System.out.println("Enter your EmailId");
				String emailId = sc.next();
				String EmailId [] = 
					{
							"abc@yahoo.com",
							"abc-100@yahoo.com",
							"abc-100@yahoo.com",
							"abc111@abc.com",
							"abc-100@abc.net",
							"abc.100@abc.com.au",
							"abc@1.com",
							"abc@gmail.com.com",
							"abc+100@gmail.com",
							"abc","abc@.com.my",
							"abc123@gmail.a",
							"abc123@.com",
							"abc123@.com.com",
							".abc@abc.com",
							"abc()*@gmail.com",
							"abc@%*.com",
							"abc..2002@gmail.com",
							"abc.@gmail.com",
							"abc@abc@gmail.com",
							"abc@gmail.com.1a",
							"abc@gmail.com.aa.au",
							"abc1..@gmail.com"
					};
				emailIdValidation(emailId);
				break;
			case 4:
				System.out.println("Enter your Mobile Number");
				String mobileNumber = sc.next();
				MobileNumberValidation(mobileNumber);
				break;
			case 5:
				System.out.println("Enter your Password");
				String password = sc.next();
				PasswordValidation(password);
				break;
			case 6:
				return;
			}
		}
	}
}
