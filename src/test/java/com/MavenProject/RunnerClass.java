package com.MavenProject;

import java.io.IOException;

import com.properties.FileReaderManager;
import com.sdp.PageObjectManager;

public class RunnerClass extends BaseClass {

	public static void main(String[] args) throws IOException {

		browserLaunch();
		PageObjectManager obj= new PageObjectManager(driver);
		
		
		openURL(FileReaderManager.getInstanceFRM().getInstanceCR().getURL());

		sendKeys(obj.getInstanceLp().getUsername(), FileReaderManager.getInstanceFRM().getInstanceCR().getUsername());

		sendKeys(obj.getInstanceLp().getPassword(), FileReaderManager.getInstanceFRM().getInstanceCR().getPassword());

		clickSingle(obj.getInstanceLp().getLoginButton());

		selectByValue(obj.getInstanceBd().getSelectlocation(), FileReaderManager.getInstanceFRM().getInstanceCR().getLocation()
				);

		selectByVisibleText(obj.getInstanceBd().getSelectHotel(), FileReaderManager.getInstanceFRM().getInstanceCR().getHotelName());

		selectByVisibleText(obj.getInstanceBd().getSelectRoomType(), FileReaderManager.getInstanceFRM().getInstanceCR().getRoomType());

		selectByIndex(obj.getInstanceBd().getSelectNumberOfRooms(), 4);

		clearText(obj.getInstanceBd().getSelectCheckIn());
		clearText(obj.getInstanceBd().getSelectCheckOut());

		sendKeys(obj.getInstanceBd().getSelectCheckIn(), FileReaderManager.getInstanceFRM().getInstanceCR().getCheckInDate());

		sendKeys(obj.getInstanceBd().getSelectCheckOut(), FileReaderManager.getInstanceFRM().getInstanceCR().getCheckOutDate());

		selectByValue(obj.getInstanceBd().getSelectAdultsRoom(), FileReaderManager.getInstanceFRM().getInstanceCR().getAdultRooms());

		selectByValue(obj.getInstanceBd().getSelectChildRoom(), FileReaderManager.getInstanceFRM().getInstanceCR().getChildRooms());

		clickSingle(obj.getInstanceBd().getSearchButton());

		clickSingle(obj.getInstanceHs().getSelectRadioButton());
		clickSingle(obj.getInstanceHs().getContinueButton());

		sendKeys(obj.getInstanceBhp().getTextFirstName(), FileReaderManager.getInstanceFRM().getInstanceCR().getFirstName());
		sendKeys(obj.getInstanceBhp().getTextLastName(), FileReaderManager.getInstanceFRM().getInstanceCR().getLastName());
		sendKeys(obj.getInstanceBhp().getTextBillingAddress(),
				FileReaderManager.getInstanceFRM().getInstanceCR().getAddess());

		sendKeys(obj.getInstanceBhp().getCreditCardNumber(), FileReaderManager.getInstanceFRM().getInstanceCR().getCreditCard());

		selectByIndex(obj.getInstanceBhp().getCreditCardType(), 1);

		selectByValue(obj.getInstanceBhp().getCreditCardExpiry(), FileReaderManager.getInstanceFRM().getInstanceCR().getExpiryMonth());

		selectByValue(obj.getInstanceBhp().getCreditCardYear(), FileReaderManager.getInstanceFRM().getInstanceCR().getExpiryYear());

		sendKeys(obj.getInstanceBhp().getCreditCardCVV(), FileReaderManager.getInstanceFRM().getInstanceCR().getCreditCVV());

		waitImplicitly();

		clickSingle(obj.getInstanceBhp().getBookNowbutton());

		clickSingle(obj.getInstanceMp().getMyItenaryButton());

		screenshot(FileReaderManager.getInstanceFRM().getInstanceCR().getFilePath());

	}

}
