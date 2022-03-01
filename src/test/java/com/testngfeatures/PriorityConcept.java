package com.testngfeatures;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test(priority = -4)
	public void method1() {

		System.out.println("This is Production Method1");

	}

	@Test(priority = -3)
	public void method2() {

		System.out.println("This is Production Method2");

	}

	@Test(priority = -2)
	public void method3() {

		System.out.println("This is Production Method3");

	}

	@Test(priority = 1)
	public void method4() {

		System.out.println("This is Production Method4");

	}

	@Test(priority = 0)
	public void testMethod1() {

		System.out.println("This is Test Method1");

	}

	@Test(priority = -1)
	public void testMethod2() {

		System.out.println("This is Test Method2");

	}

	@Test(priority = 4)
	public void testMethod3() {

		System.out.println("This is Test Method3");

	}

	@Test(priority = 2)

	public void variables() {

		System.out.println("These are Variables..");

	}

}
