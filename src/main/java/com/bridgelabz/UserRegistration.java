package com.bridgelabz;

public class UserRegistration {

	public boolean firstNameValidation(String FirstName) {
		boolean Validation = FirstName.matches("^[A-Z]{1}[a-z A-Z]{2,}$");
		if(Validation){
			System.out.println(FirstName+" is a Valid First Name");
		} else {
			System.out.println(FirstName+" is a Invalid First Name");
		}
		return Validation;
	}

	public boolean lastNameValidation(String lastName) {
		boolean Validation =lastName.matches ("[A-Z]{1}[a-z]{2,}$");
		if (Validation) {
			System.out.println(lastName + " is a Valid Last Name");
		}else {
			System.out.println(lastName + " is a Invalid Last Name");
		}
		return Validation ;
	}

	public boolean emailIdValidation(String emailId) {
		boolean Validation= emailId.matches("^[0-9 A-Z a-z]+(([._+-]*)[0-9A-Za-z]+)*@[0-9 A-Z a-z]+.[a-z]{2,4}([.]    [a-z]{2,3})*$");
		if (Validation){
			System.out.println(emailId+" is a Valid Email Id\n");
		} else {
			System.out.println(emailId+" is a Invalid Email Id");
		}
		return Validation;
	}

	public boolean MobileNumberValidation(String mobileNumber) {
		boolean Validation=mobileNumber.matches ("^[9][1]\\s[6-9]{1}[0-9]{9}$");
		if (Validation) {
			System.out.println(mobileNumber+" is a Valid  Mobile Number\n");
		} else {
			System.out.println(mobileNumber+" is a Invalid Mobile Number");
		}
		return Validation;

	}

	public boolean PasswordValidation(String password) {
		boolean Validation = password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$");
		if (Validation){
			System.out.println(password+" is a Valid  Password\n");
		}else {
			System.out.println(password+" is an Invalid Password");
		}
		return Validation;
	}


}
