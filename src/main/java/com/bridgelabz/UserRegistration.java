package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public boolean firstNameValidation() throws InvalidUserInputException {
		System.out.println("Enter First Name : ");
		String name = scan.next();
		String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcherObj = pattern.matcher(name);

		if (matcherObj.matches() == true) {
			System.out.println("First Name : " + name + " is " + matcherObj.matches());
			return matcherObj.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public boolean lastNameValidation() throws InvalidUserInputException {
		System.out.println("Enter Last Name : ");
		String lastname = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcherObj = pattern.matcher(lastname);

		if (matcherObj.matches() == true) {
			System.out.println("Last Name : " + lastname + " is " + matcherObj.matches());
			return matcherObj.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public boolean emailValidation() throws InvalidUserInputException {
		System.out.println("Enter Email ID: ");
		String email = scan.next();
		String regex = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.] [a-z]{2,3})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcherObj = pattern.matcher(email);

		if (matcherObj.matches() == true) {
			System.out.println("Email Id : " + email + " is " + matcherObj.matches());
			return matcherObj.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public boolean MobileNumberValidation() throws InvalidUserInputException {
		System.out.println("Enter Mobile Number : ");
		String mobile = scan.next();
		String regex = "(91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcherObj = pattern.matcher(mobile);

		if (matcherObj.matches() == true) {
			System.out.println("Mobile Number : " + mobile + " is " + matcherObj.matches());
			return matcherObj.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();

	}

	public boolean PasswordValidation() throws InvalidUserInputException {
		System.out.println("Enter Password : ");
		String password = scan.next();
		String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcherObj = pattern.matcher(password);

		if (matcherObj.matches() == true) {
			System.out.println("Password : " + password + " is " + matcherObj.matches());
			return matcherObj.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

}
