package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement textFirstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement textLastName;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement textBillingAddress;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditCardNumber;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditCardType;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement creditCardExpiry;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement creditCardYear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement creditCardCVV;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNowbutton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTextFirstName() {
		return textFirstName;
	}

	public WebElement getTextLastName() {
		return textLastName;
	}

	public WebElement getTextBillingAddress() {
		return textBillingAddress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getCreditCardExpiry() {
		return creditCardExpiry;
	}

	public WebElement getCreditCardYear() {
		return creditCardYear;
	}

	public WebElement getCreditCardCVV() {
		return creditCardCVV;
	}

	public WebElement getBookNowbutton() {
		return bookNowbutton;
	}

	public BookAHotelPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
