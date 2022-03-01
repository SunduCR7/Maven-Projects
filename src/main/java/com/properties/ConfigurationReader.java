package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getURL() {

		String URL = p.getProperty("URL");

		return URL;

	}

	public String getUsername() {

		String Username = p.getProperty("Username");

		return Username;

	}

	public String getPassword() {

		String Password = p.getProperty("Password");

		return Password;

	}

	public String getLocation() {

		String Location = p.getProperty("Location");

		return Location;

	}

	public String getHotelName() {

		String HotelName = p.getProperty("HotelName");

		return HotelName;

	}

	public String getRoomType() {

		String RoomType = p.getProperty("RoomType");

		return RoomType;

	}

	public String getCheckInDate() {

		String CheckInDate = p.getProperty("CheckInDate");

		return CheckInDate;

	}

	public String getCheckOutDate() {

		String CheckOutDate = p.getProperty("CheckOutDate");

		return CheckOutDate;

	}

	public String getAdultRooms() {

		String AdultRooms = p.getProperty("AdultRooms");

		return AdultRooms;

	}

	public String getChildRooms() {

		String ChildRooms = p.getProperty("ChildRooms");

		return ChildRooms;
	}

	public String getFirstName() {

		String FirstName = p.getProperty("FirstName");

		return FirstName;

	}

	public String getLastName() {

		String LastName = p.getProperty("LastName");

		return LastName;

	}

	public String getAddess() {

		String Addess = p.getProperty("Addess");
		return Addess;

	}

	public String getCreditCard() {

		String CreditCard = p.getProperty("CreditCard");
		return CreditCard;

	}

	public String getExpiryMonth() {

		String ExpiryMonth = p.getProperty("ExpiryMonth");

		return ExpiryMonth;

	}

	public String getExpiryYear() {

		String ExpiryYear = p.getProperty("ExpiryYear");

		return ExpiryYear;

	}

	public String getCreditCVV() {

		String CreditCVV = p.getProperty("CreditCVV");

		return CreditCVV;

	}

	public String getFilePath() {

		String FilePath = p.getProperty("FilePath");
		return FilePath;

	}

}
