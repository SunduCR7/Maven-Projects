package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSelectionPage {
	
	public WebDriver driver;
	
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectRadioButton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueButton;	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getSelectRadioButton() {
		return selectRadioButton;
	}



	public WebElement getContinueButton() {
		return continueButton;
	}



	public HotelSelectionPage(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	
	

}
