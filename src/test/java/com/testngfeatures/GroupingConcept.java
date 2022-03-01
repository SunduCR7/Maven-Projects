package com.testngfeatures;

import org.testng.annotations.Test;

public class GroupingConcept {

	@Test(groups = "Production Method")
	public void method1() {

		System.out.println("This is Production Method1");

	}

	@Test(groups = "Production Method")
	public void method2() {

		System.out.println("This is Production Method2");

	}

	@Test(groups = "Production Method")
	public void method3() {

		System.out.println("This is Production Method3");

	}

	@Test(groups = "Production Method")
	public void method4() {

		System.out.println("This is Production Method4");

	}

	@Test(groups = "Test Method")
	public void testMethod1() {

		System.out.println("This is Test Method1");

	}

	@Test(groups = "Test Method")
	public void testMethod2() {

		System.out.println("This is Test Method2");

	}

	@Test(groups = "Test Method")
	public void testMethod3() {

		System.out.println("This is Test Method3");

	}

	@Test(groups ="variables")

	public void variables() {

		System.out.println("These are Variables..");

	}

}
