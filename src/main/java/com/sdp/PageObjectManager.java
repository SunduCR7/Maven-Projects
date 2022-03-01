package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.BookAHotelPage;
import com.pomclass.BookingDetails;
import com.pomclass.HotelSelectionPage;
import com.pomclass.LoginPage;
import com.pomclass.MyItenaryPage;

public class PageObjectManager {

	public WebDriver driver;

	private LoginPage lp;

	private BookingDetails bd;

	private BookAHotelPage bhp;

	private MyItenaryPage mp;

	private HotelSelectionPage hs;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public HotelSelectionPage getInstanceHs() {
		
		

		if (hs == null) {

			hs = new HotelSelectionPage(driver);

		}

		return hs;
	}

	public LoginPage getInstanceLp() {

		if (lp == null) {

			lp = new LoginPage(driver);

		}

		return lp;
	}

	public BookingDetails getInstanceBd() {

		if (bd == null) {

			bd = new BookingDetails(driver);

		}

		return bd;
	}

	public BookAHotelPage getInstanceBhp() {

		if (bhp == null) {

			bhp = new BookAHotelPage(driver);

		}

		return bhp;
	}

	public MyItenaryPage getInstanceMp() {

		if (mp == null) {

			mp = new MyItenaryPage(driver);

		}

		return mp;
	}

}
