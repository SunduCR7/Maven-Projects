package com.testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SotAssertion {
	
	
	@Test
	
	public void webPage() {
		
		
		String actualPage="Facebook";
		
		String expectedPage="facebook";
		
		
		SoftAssert s= new SoftAssert();
		
		s.assertEquals(actualPage, expectedPage);
		
		System.out.println("This is Verification");
		
		
		
		
		
		
		
		
		
	}
	
	

}
