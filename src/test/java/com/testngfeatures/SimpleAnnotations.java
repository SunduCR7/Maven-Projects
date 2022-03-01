package com.testngfeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	public void browserLaunch() {

		System.out.println("Browser Launch..");

	}

	@BeforeTest
	public void openURL() {

		System.out.println("Open URL");

	}

	@BeforeClass
	public void login() {

		System.out.println("Login..");

	}

	@BeforeMethod
	public void homePage() {

		System.out.println("goto HomePage..");

	}

	@Test
	public void performTask() {

		System.out.println("Perform task");

	}

	@Test
	public void performTask2() {

		System.out.println("Perform task2");

	}

	@AfterMethod
	public void logout() {

		System.out.println("Logout ..");

	}

	@AfterClass
	public void browserHomepage() {

		System.out.println("Browser homepage");

	}

	@AfterTest
	public void deleteCookies() {

		System.out.println("deleted cookies");

	}

	@AfterSuite
	public void closeBrowser() {

		System.out.println("Browser closed...");

	}

}
