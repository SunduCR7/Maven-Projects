package com.testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {

	
	
	@Test
	public void method1() {

		System.out.println("This is Method1");

	}
	@Test
	public void method2() {

		System.out.println("This is Method2");

	}
	
	@Ignore
	@Test
	public void method3() {

		System.out.println("This is Method3");

	}
	@Test
	public void method4() {

		System.out.println("This is Method4");

	}
	@Test
	public void testMethod1() {

		System.out.println("This is Test Method1");

	}
	@Test
	public void testMethod2() {

		System.out.println("This is Test Method2");

	}
	
	
	@Ignore
	@Test
	public void testMethod3() {

		System.out.println("This is Test Method3");

	}

}
