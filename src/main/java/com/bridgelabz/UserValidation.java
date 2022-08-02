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
				System.out.println("Enter your Email");
				String emailId = sc.next();
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
