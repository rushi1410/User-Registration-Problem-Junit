package com.bridgelabz;

import org.junit.Test;
import junit.framework.Assert;

public class UserRegistrationTest {
	@Test
	public void firstnameTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.firstNameValidation();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void lastnameTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.lastNameValidation();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void emailTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.emailValidation();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void mobileTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.MobileNumberValidation();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void passwordTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.PasswordValidation();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

}



