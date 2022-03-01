package com.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {

	
	@Test
	public void loginPage() {
		
		
		String expectedPage="Facebook";
		String actualPage="Facebook";
		
		
		Assert.assertEquals(actualPage, expectedPage);		
		
		System.out.println("This is Validation");
		
		
		
		
		
	}
	
	
	
	
	
	
}
