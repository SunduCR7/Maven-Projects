package com.testngfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@Test(dataProvider="inputData")
	public void credentials(String username, String password)
	
	{

		
		System.out.println("Username is :"+username);
		System.out.println("Password is:"+password);
		
	}

	@DataProvider	
	public Object[][] inputData(){
		
		return new Object [][] {		
			
			{"Sundaram","1234"},{"Aravind","4332"},{"Poobala","5432"},{"Karthi","6982"}	
		
			
		};
				
	}

}
