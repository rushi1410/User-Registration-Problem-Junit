package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationMain {

	public static  void firstNameValidation(String FirstName){
		boolean isFirstName;
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern patternObj = Pattern.compile(regex);
		if (FirstName == null){

		}
		Matcher matcherObj = patternObj.matcher(FirstName);
		isFirstName =  matcherObj.matches();
		if(isFirstName)
			System.out.println(FirstName+" is an Valid First Name");
		else
			System.err.println(FirstName+" is an Invalid First Name");

	}
	public static void lastNameValidation(String lastName) {

		boolean isLastName;
		String lastNameRegex = "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(lastNameRegex);
		if (lastName == null) {
			isLastName = false;
		}
		Matcher matcherObj = patternObj.matcher(lastName);
		isLastName = matcherObj.matches();

		if (isLastName)
			System.out.println(lastName + " is an Valid Last Name");
		else
			System.err.println(lastName + " is an Invalid Last Name");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration System");
		Scanner input = new Scanner(System.in);

		System.out.print("Enter firstname: ");
		String FirstName = input.nextLine();
		firstNameValidation(FirstName);

		System.out.println("Enter your lastname: ");
		String LastName = input.nextLine();
		lastNameValidation(LastName);
		input.close();
	}
}

