package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetails {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement selectlocation;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement selectHotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement selectRoomType;

	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement selectNumberOfRooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement selectCheckIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement selectCheckOut;
	
	
	@FindBy(xpath="//Select[@name='adult_room']")
	private WebElement selectAdultsRoom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchButton;
	
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectNumberOfRooms() {
		return selectNumberOfRooms;
	}

	public WebElement getSelectCheckIn() {
		return selectCheckIn;
	}

	public WebElement getSelectCheckOut() {
		return selectCheckOut;
	}

	public WebElement getSelectAdultsRoom() {
		return selectAdultsRoom;
	}

	public WebElement getSelectChildRoom() {
		return selectChildRoom;
	}

	@FindBy(xpath="//Select[@name='child_room']")
	private WebElement selectChildRoom;

	
	
	
	
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectlocation() {
		return selectlocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public BookingDetails(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

}
