package com.bridgelabz;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_ShouldReturn_True() {
		boolean result = userRegistration.firstNameValidation("Rushikesh");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_ShouldReturn_False() {
		boolean result = userRegistration.firstNameValidation("rushikesh");
		Assert.assertFalse(result);
	}

	@Test
	public void givenFirstName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
		boolean result = userRegistration.firstNameValidation("Ru");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
		boolean result = userRegistration.lastNameValidation("Mo");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
		boolean result = userRegistration.lastNameValidation("molkire");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenStartWithCapitalLetters_ShouldReturnTrue() {
		boolean result = userRegistration.lastNameValidation("Molkire");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenStartsWithSmallLetter_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidation("rushi14@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenStartsWithCapitalLetter_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidation("Rushi14@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenEndsWithComOrIn_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidation("rushi.molkere@gmail.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenDoNotEndsWithComOrIn_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidation("rushi.molkere@gmail.comm");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNumber_WhenFollowedByCountryCode_ShouldReturnTrue() {
		boolean result = userRegistration.MobileNumberValidation("91 8123932881");
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNumber_WhenDoesNotFollowedByCountryCode_ShouldReturnFalse() {
		boolean result = userRegistration.MobileNumberValidation("8123932881");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNumber_WhenDoNotHaveTenDigitNumber_ShouldReturnFalse() {
		boolean result = userRegistration.MobileNumberValidation("812393288");
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNumber_WhenHaseTenDigitNumber_ShouldReturnTrue() {
		boolean result = userRegistration.MobileNumberValidation("91 8123932881");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenIsMinimumEightDigit_ShouldReturnTrue() {
		boolean result = userRegistration.PasswordValidation("Rush$141");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturnFalse() {
		boolean result = userRegistration.PasswordValidation("Rush$12");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenContainOneUpperCase_ShouldReturnTrue() {
		boolean result = userRegistration.PasswordValidation("Rushi$141");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
		boolean result = userRegistration.PasswordValidation("rush$141");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenContainsOneNumericNumber_ShouldReturnTrue() {
		boolean result = userRegistration.PasswordValidation("Rush$1411");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenDoNotContainOneNumericNumber_ShouldReturnFalse() {
		boolean result = userRegistration.PasswordValidation("rush$#");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturnTrue() {
		boolean result = userRegistration.PasswordValidation("Rush$1419");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturnFalse() {
		boolean result = userRegistration.PasswordValidation("Rush1421");
		Assert.assertFalse(result);
	}



}



