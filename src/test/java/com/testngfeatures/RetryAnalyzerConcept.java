package com.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerConcept {

	@Test

	public void loginPage() {

		String exp = "Facebook";

		String act = "Facebook";

		Assert.assertEquals(act, exp);

	}
	
	

	@Test (retryAnalyzer = RetryCount.class)
	public void loginPage2() {

		String exp = "Instagram";

		String act = "instagram";

		Assert.assertEquals(act, exp);

	}
	


}
