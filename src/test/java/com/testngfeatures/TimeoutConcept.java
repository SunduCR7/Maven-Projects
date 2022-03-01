package com.testngfeatures;

import org.testng.annotations.Test;

public class TimeoutConcept {

	@Test(timeOut = 12000)
	public void userBankSession() throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("browser launch & URl Launch");

		Thread.sleep(2000);

		System.out.println("Open Homepage");

		Thread.sleep(2000);
		System.out.println("Login to portal");

		Thread.sleep(2000);

		System.out.println("Open personal Account");

		Thread.sleep(2000);
		System.out.println("Transfer funds");

		Thread.sleep(2000);
		System.out.println("Goto Payment Gateway");

		System.out.println("Refresh Page");

		Thread.sleep(2000);
		System.out.println("Process Payment");

		Thread.sleep(2000);
		System.out.println("logout");

		Thread.sleep(1000);
		System.out.println("Close browser & end session");

	}

}
