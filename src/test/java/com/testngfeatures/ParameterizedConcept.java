package com.testngfeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedConcept {

	@Test

	@Parameters({ "username", "password" })
	public void loginPage(@Optional("SundaramCR") String userName, String password) {

		System.out.println("Username is :" + userName);

		System.out.println("Password is:" + password);

	}

}
