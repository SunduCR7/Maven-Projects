package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependenciesConcept {

	
	@Test 
	public void method1() {
		
		System.out.println("This is method1");
		
		
		
	}
	
	@Test (dependsOnMethods = "method1")
	public void method2() {
		
		
		System.out.println("This is method 2");
		
	}
	
	@Ignore
	
	@Test (dependsOnMethods = "method1")
	public void method3() {
		
		System.out.println("This is method 3");
		
		
	}
	
	
	
}
