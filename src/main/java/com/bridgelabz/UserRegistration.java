package com.bridgelabz;
import java.util.regex.*;

interface Check {
	public String format(String name);
}

public class UserRegistration {

	public static void main(String[] args) {
		// Lambda expression for Check first Name
		Check firstName = (name) -> {
			String firstNameRegex = "^[A-Z]{1}[a-z A-Z]{2,}$";
			Pattern patternObj = Pattern.compile(firstNameRegex);
			Matcher matcherObj = patternObj.matcher(name);
			if (matcherObj.matches()) {
				System.out.println("Valid First Name:");
			} else {
				System.err.println("Invalid First Name:");
			}
			return name;
		};
		System.out.println(firstName.format("Rushikesh"));

		// Lambda expression for Check last Name
		Check lastName = (name) -> {
			String lastNameRegex = "[A-Z]{1}[a-z]{2,}$";
			Pattern patternObj = Pattern.compile(lastNameRegex);
			Matcher matcherObj = patternObj.matcher(name);
			if (matcherObj.matches()) {
				System.out.println("Valid Last Name:");
			} else {
				System.err.println("Invalid Last Name:");
			}
			return name;
		};
		System.out.println(lastName.format("Molkire"));

		// Lambda expression for Check Email Name
		Check emailId = (email) -> {
			String emailIdRegex = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
			Pattern patternObj = Pattern.compile(emailIdRegex);
			Matcher matcherObj = patternObj.matcher(email);
			if (matcherObj.matches()) {
				System.out.println("Valid Email Id:");
			} else {
				System.out.println("Invalid Email Id:");
			}
			return email;
		};
		System.out.println(emailId.format("rushi.molkere@gmail.com"));

		// Lambda expression for Check Mobile Number
		Check mobileNumber = (mobileNum) -> {
			String mobileNumberRegex = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
			Pattern patternObj = Pattern.compile(mobileNumberRegex);
			Matcher matcherObj = patternObj.matcher(mobileNum);
			if (matcherObj.matches()) {
				System.out.println("Valid  Mobile Number:");
			} else {
				System.out.println("Invalid Mobile Number");
			}
			return mobileNum;
		};
		System.out.println(mobileNumber.format("91 8123932881"));

		// Lambda expression for Check Password
		Check Password = (password) -> {
			String passwordRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
			Pattern patternObj = Pattern.compile(passwordRegex);
			Matcher matcherObj = patternObj.matcher(password);
			if (matcherObj.matches()) {
				System.out.println("Valid Password:");
			} else {
				System.out.println("Invalid Password:");
			}
			return password;
		};
		System.out.println(Password.format("Rushi@141"));
	}
}
