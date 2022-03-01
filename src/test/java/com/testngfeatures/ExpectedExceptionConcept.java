package com.testngfeatures;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test (expectedExceptions = NullPointerException.class)
	public void stringFunction() {
		
		
		String s= null;
		
		System.out.println(s.charAt(0));
		
		
		
		
	}
	

}
