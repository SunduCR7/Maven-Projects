package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItenaryPage {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement myItenaryButton;
	

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMyItenaryButton() {
		return myItenaryButton;
	}


	public MyItenaryPage(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

}
