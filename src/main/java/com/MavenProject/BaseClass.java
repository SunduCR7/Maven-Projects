package com.MavenProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;
	static WebElement element;
	static Actions ac;

	// *************Browser Launch*****************************

	public static void browserLaunch() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}// End of method browserLaunch

	// *****************SENDKEYS*******************************

	public static void sendKeys(WebElement webElement, String key) {

		webElement.sendKeys(key);

	}

	// ************CLICK*********************************

	public static void clickSingle(WebElement webElement) {

		webElement.click();
	}

	// ****************RADIO BUTTON******************************

	public static void radioButton(WebElement webElement) {

		webElement.click();
	}

	public static void radioButtonIsEnabled(WebElement webElement) {

		System.out.println(webElement.isEnabled());

	}

	// ************CLEAR (TEXT)************************************

	public static void clearText(WebElement webElement) {

		webElement.clear();

	}

	// *********Perform Close******************************

	public static void close() {

		driver.close();

	}// End of method close

	// **********Perform quit**************************

	public static void quit() {

		driver.quit();

	}// End of method quit

	// ************Perform Navigate to**************************

	public static void navigateTo(String s) {

		driver.navigate().to(s);

	}// End of method navigateTo

	// ************Perform Navigate Back************************
	public static void navigateBack() {

		driver.navigate().back();

	}// End of method navigateBack

	// ************Perform Navigate forward************************
	public static void navigateForward() {

		driver.navigate().forward();

	}// End of method navigateForward

	// ************ Perform page refresh ************************

	public static void refresh() {

		driver.navigate().refresh();

	}// End of method refresh

	// ************************Perform GetURL ************************
	public static void openURL(String s) {

		driver.get(s);

	}// End of method openURL

	// **********************ALERT*********************************************

	public static Alert switchToAlert() {

		Alert a = driver.switchTo().alert();

		return a;

	}// End of method switchToAlert

	public static void alertOperations(Alert a, String s) {

		if (s.equalsIgnoreCase("Accept")) {

			a.accept();

		}

		else if (s.equalsIgnoreCase("Dismiss")) {

			a.dismiss();

		}

	}// End of method alertOperations

	// ******************ACTIONS********************************

	public static void actionsContextClick(WebElement element) {

		ac = new Actions(driver);
		ac.contextClick(element).build().perform();

	}// End of method actionsContextClick

	public static void actionsDoubleClick(WebElement element)

	{

		ac = new Actions(driver);
		ac.doubleClick(element).build().perform();

	}// End of method actionsDoubleClick

	public static void actionsMoveToElement(WebElement element) {

		ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}// End of method actionsMoveToElement

	public static void actionsdDragDrop(WebElement drag, WebElement drop) {

		ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();

	}// End of method actionsDragDrop

	// ********************FRAMES******************************************

	public static void frame(WebElement element) {

		driver.switchTo().frame(element);

	}// End of method frame

	public static void parentFrame() {

		driver.switchTo().parentFrame();

	}// End of method parentFrame

	public static void switchDefaultContent() {

		driver.switchTo().defaultContent();

	}// End of method switchDefaultContent

	public static void frameIdName(String nameOrId) {

		driver.switchTo().frame(nameOrId);

	}// End of method frameIdName

	public static void frameIndex(int index) {

		driver.switchTo().frame(index);

	}// End of method frameIndex

	// ******************************ROBOT**************************************

	public static void robot(String upDownOrEnter) throws AWTException {
		Robot r = new Robot();

		if (upDownOrEnter.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		else if (upDownOrEnter.equalsIgnoreCase("enter")) {

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

		else if (upDownOrEnter.equalsIgnoreCase("up")) {

			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		}

		else {

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		}

	}

	// *********************WINDOW HANDLING*****************************

	public static String getTitleOfWindow() {

		String windowHandle = driver.getWindowHandle();

		String title = driver.switchTo().window(windowHandle).getTitle();

		System.out.println(title);

		return title;

	}// End of method getTitleOfWindow

	public static Set<String> getTitlesOfWindowHandles() {

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {

			System.out.println(driver.switchTo().window(string).getTitle());

		}

		return windowHandles;

	}// End of method getTitlesOfWindowHandles

	public static void switchToWindowByTitle(Set<String> windowHandles, String title) {

		for (String string : windowHandles) {

			if (driver.switchTo().window(string).getTitle().equals(title)) {

				break;
			}

		}

	}// End of method switchToWindowByTitle

	// ************SELECT OPERATIONS (DropDown)********************

	public static void isMultipleDropDown(WebElement webElement) {

		Select s = new Select(webElement);

		System.out.println(s.isMultiple());

	}// End of method isMultipleDropDown

	public static void selectByValue(WebElement webElement, String value) {

		Select s = new Select(webElement);

		s.selectByValue(value);

	}// End of method selectByValue

	public static void selectByVisibleText(WebElement webElement, String visibleText) {

		Select s = new Select(webElement);

		s.selectByVisibleText(visibleText);

	}// End of method selectByVisibleText

	public static void selectByIndex(WebElement webElement, int index) {

		Select s = new Select(webElement);

		s.selectByIndex(index);

	}// End of method selectByIndex

	public static void getAllSelected(WebElement webElement) {

		Select s = new Select(webElement);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement aso : allSelectedOptions) {

			System.out.println(aso.getText());

		}

	}// End of method getAllSelected

	public static void getFirstSelected(WebElement webElement) {

		Select s = new Select(webElement);

		System.out.println(s.getFirstSelectedOption().getText());

	}// End of method getFirstSelectedOption

	public static void getOptions(WebElement webElement) {

		Select s = new Select(webElement);

		List<WebElement> l = s.getOptions();

		for (WebElement options : l) {

			System.out.println(options.getText());

		}

	}// End of method getOptions

	public static void deselectAll(WebElement webElement) {

		Select s = new Select(webElement);

		s.deselectAll();

	}// End of method deselectAll

	public static void deselectByValue(WebElement webElement, String value) {

		Select s = new Select(webElement);

		s.deselectByValue(value);

	}// End of method deselectByValue

	public static void deselectByIndex(WebElement webElement, int index) {

		Select s = new Select(webElement);

		s.deselectByIndex(index);

	}// End of method deselectByIndex

	public static void deselectByVisibleText(WebElement webElement, String visibleText) {

		Select s = new Select(webElement);
		s.deselectByVisibleText(visibleText);

	}// End of method deselectByvisibleText

	// ***************************CHECKBOX******************************************

	public static void isCheckboxSelected(WebElement webElement) {

		System.out.println(webElement.isSelected());

	}

	public static void enableCheckBox(WebElement webElement) {

		webElement.click();

	}

	// **************IS ENABLED***************************

	public static boolean isEnabled(WebElement webElement) {

		System.out.println(webElement.isEnabled());

		return webElement.isEnabled();

	}

	// ***************IS DISPLAYED***********************

	public static boolean isDisplayed(WebElement webElement) {

		System.out.println(webElement.isDisplayed());

		return webElement.isDisplayed();

	}

	// **************IS SELECTED*************************

	public static boolean isSelected(WebElement webElement) {

		System.out.println(webElement.isSelected());

		return webElement.isSelected();

	}

	// *************GET CURRENTURL*****************************

	public static void getCurrentURL() {

		System.out.println(driver.getCurrentUrl());

	}

	// ***************GET TEXT********************************

	public static void getText(WebElement webElement) {

		webElement.getText();

	}

	// **********************GET ATTRIBUTE*************************

	public static void getAttributeValue(WebElement webElement, String attributeName) {

		System.out.println(webElement.getAttribute(attributeName));

	}

	// **********************WAIT*************************************

	public static void wait(WebElement webElement) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOf(webElement));

	}

	// **********IMPLICIT WAIT***************************************

	public static void waitImplicitly() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// ******************************SCREENSHOT*************************************

	public static void screenshot(String filepath_name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filepath_name);
		FileUtils.copyFile(src, dest);

	}// End of method screenshot

	// ****************JAVASCRIPTEXECUTOR SCROLLING*****************

	public static void scrolling(WebElement webElement) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", webElement);

	}// End of method scrolling

}
