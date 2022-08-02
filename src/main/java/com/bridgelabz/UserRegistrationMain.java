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

	public static void emailIdValidation(){
		String emailIdRegex = "^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.][a-z]{2,3})*$";
		Pattern patternObj = Pattern.compile(emailIdRegex);
		String EmailId [] = 
			{
					"abc@yahoo.com",
					"abc-100@yahoo.com",
					"abc.100@yahoo.com",
					"abc111@abc.com",
					"abc-100@abc.net",
					"abc.100@abc.com.au",
					"abc@1.com",
					"abc@gmail.com.com",
					"abc+100@gmail.com",

					"abc",
					"abc@.com.my",
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
		for(int i=0;i<EmailId.length;i++) {
			Matcher emailId = patternObj.matcher(EmailId[i]);
			if(emailId.matches()) {
				System.out.println("Valid EmailId:"+EmailId[i]);
			}
			else {
				System.out.println("InValid EmailId:"+EmailId[i]);
			}
		}
	}


	public static void MobileNumberValidation(String mobileNumber){

		boolean isMobileNumber;
		String mobileNumberRegex = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
		Pattern patternObj = Pattern.compile(mobileNumberRegex);
		if (mobileNumber == null) {
			isMobileNumber = false;
		}
		Matcher matcherObj = patternObj.matcher(mobileNumber);
		isMobileNumber =  matcherObj.matches();

		if(isMobileNumber)
			System.out.println(mobileNumber+" is a Valid  Mobile Number\n");
		else
			System.out.println(mobileNumber+" is a Invalid Mobile Number");
	}
	public static void PasswordValidation(String password){

		boolean isPassword;
		String passwordRegex ="^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
		Pattern patternObj = Pattern.compile(passwordRegex);
		if (password == null) {
			isPassword = false;
		}
		Matcher matcherObj = patternObj.matcher(password);
		isPassword =  matcherObj.matches();

		if(isPassword)
			System.out.println(password+" is a Valid  Password\n");
		else
			System.out.println(password+" is an Invalid Password");
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

		System.out.println("Enter your EmailId: ");
		String EmailID = input.nextLine();
		emailIdValidation();

		System.out.println("Enter the mobile number with country code 91: ");
		String MobileNumber = input.nextLine();
		MobileNumberValidation(MobileNumber);

		System.out.println("enter the Password");
		String Password = input.nextLine();
		PasswordValidation(Password);
		input.close();

	}


}

