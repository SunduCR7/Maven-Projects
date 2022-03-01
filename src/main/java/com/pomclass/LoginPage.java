package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement loginButton;
	
	
	
	
	
	

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return username;
	}

	public LoginPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
