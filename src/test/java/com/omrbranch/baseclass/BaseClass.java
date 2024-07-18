package com.omrbranch.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	Select select;
	Actions actions;

	// 1 Mouse Over Actions
	public void elementMosuseOverActions(WebElement element) {
		actions = new Actions(driver);
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			actions.moveToElement(element).perform();
		}
	}

	// 2 Drag And Drop
	public void elementDragAndDrop(WebElement sourceElement, WebElement destElement) {
		visibilityOfElement(destElement);
		visibilityOfElement(sourceElement);
		if (elementIsDisplayed(destElement) && elementIsDisplayed(sourceElement)) {

			actions = new Actions(driver);
			actions.dragAndDrop(sourceElement, destElement).perform();
		}
	}

	// 3 Element Clear
	public void elementClear(WebElement element) {
		visibilityOfElement(element);
		if (elementIsDisplayed(element)) {
			element.clear();
		}
	}

	// 4 Get All Options
	public List<String> dropdownGetAllOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		List<String> allOPtionsText = new ArrayList<>();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			allOPtionsText.add(text);

		}
		return allOPtionsText;
	}

	// Byte Screenshot

	public byte[] screenshotbyt() {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;

	}

	// 5 Take Screenshot
	public void screenshot(String sName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AM\\screenshots\\" + sName + ".png"));
	}

	// 6 Element Screenshot
	public void screenshot(WebElement element, String sName) throws IOException {
		File f = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f,
				new File("C:\\Users\\LENOVO\\eclipse-workspace\\FrameworkClass930AM\\screenshots\\" + sName + ".png"));
	}

	// 7 Visibility Of Element
	public void visibilityOfElement(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	// 8 ImplictWait
	public static void implictWait(int secs) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secs));
	}

	// 9 ImplictWait 1
	public static void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	// 10 Sendkeys JS
	public void elementSendKeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public void insertValueJs(WebElement element,String data) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
    	element.click();
    }
	
	// 11 Select Option BY Text
	public void selectOptionByText(WebElement element, String text) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 12 Select Option By Value
	public void selectOptionByValue(WebElement element, String text) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByValue(text);
	}

	public static void closeallwindow() {

		driver.quit();
	}

	// 13 Select Option By Index
	public void selectOptionByIndex(WebElement element, int index) {
		visibilityOfElement(element);
		select = new Select(element);
		select.selectByIndex(index);
	}

	// 14 Element is Displayed
	public boolean elementIsDisplayed(WebElement element) {
		visibilityOfElement(element);
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	// 15 Element is Enabled
	public boolean elementIsEnabled(WebElement element) {
		visibilityOfElement(element);
		boolean displayed = element.isEnabled();
		return displayed;
	}

	// 16 Launch Browser
//		public static void browserLaunch() {
//			driver = new ChromeDriver();
//		}
	// 17 Enter Url
	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	// 18 window maximize
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// 19 SendkeysEnter
	public void elementSendKeysEnter(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.sendKeys(data, Keys.ENTER);
		}
	}

	// 20 Element Click
	public void elementClick(WebElement element) {
		visibilityOfElement(element);
		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.click();
		}
	}

	// 21 Get Title
	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 22 Find Locator By ID
	public WebElement findLocatorById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));

		return element;
	}

	// 23 Find Locator By Name
	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	// 24 Get Text
	public String elementGetText(WebElement element) {
		visibilityOfElement(element);
		String text = "";

		if (elementIsDisplayed(element)) {
			text = element.getText();
		}
		return text;
	}

	// 99% value is fixed
	public String elementGetAttribute(WebElement element) {
		visibilityOfElement(element);
		String attribute = "";
		if (elementIsDisplayed(element)) {
			attribute = element.getAttribute("value");
		}
		return attribute;
	}

	// 1% value is NOT fixed
	public String elementGetAttribute(WebElement element, String attributename) {
		visibilityOfElement(element);
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	// Get Cell Data
	public String getCellData(String sheetName, int rownum, int cellnum) throws IOException {

		String res = "";
		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven11AM\\Excel2\\Traveler Details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {

		case STRING:

			res = cell.getStringCellValue();

			break;

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyy");

				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();

				long round = Math.round(numericCellValue);

				if (round == numericCellValue) {

					res = String.valueOf(round);

				} else {

					res = String.valueOf(numericCellValue);

				}

			}

		default:
			break;
		}

		return res;
	}

	// Update All Data
	public void upDateallData(String sheetName, int rownum, int cellnum, String oldData, String newData)
			throws IOException {

		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven11AM\\Excel2\\Traveler Details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();

		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}

		FileOutputStream fileOuptStream = new FileOutputStream(file);

		workbook.write(fileOuptStream);

	}

	// Create Cell and Set Data
	public void createCellAndSetData(String sheetName, int rownum, int cellnum, String data) throws IOException {

		File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven11AM\\Excel2\\Traveler Details.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		cell.setCellValue(data);

		FileOutputStream fileOutputStream = new FileOutputStream(file);

		workbook.write(fileOutputStream);

	}

	public List<WebElement> findlocatorByXpath(String xpath) {

		List<WebElement> elements = driver.findElements(By.xpath(xpath));

//	    	for (WebElement webElement : elements) {
//	    		
//	    		String elementGetText = elementGetText(webElement);
//	    		System.out.println(elementGetText);
//				
//			}

		return elements;

	}

	// Find locator by Xpath
	public WebElement findLocatorByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));

		return element;

	}

	// sendkeys
	public void elementSendKeys(WebElement element, String data) {
		visibilityOfElement(element);

		if (elementIsEnabled(element) && elementIsDisplayed(element)) {
			element.sendKeys(data);
		}
	}

	public List<WebElement> findLocatorBytagname(String tag) {

		List<WebElement> element = driver.findElements(By.tagName(tag));

		for (WebElement webElement : element) {

			String elementGetText = elementGetText(webElement);
			System.out.println(elementGetText);

		}

		return element;
	}

	public List<WebElement> findLocatorByTagname(String tag) {

		List<WebElement> elements = driver.findElements(By.tagName(tag));

		for (WebElement webElement : elements) {

			String elementGetText = elementGetText(webElement);
			System.out.println(elementGetText);

		}

		return elements;
	}

	public void keyBordaction() throws AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void switchFrameIndex(int i) {
		driver.switchTo().frame(i);
	}

	public void switchFrameId(String data) {
		driver.switchTo().frame(data);
	}

	public void okAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void cancelAlert() {

		Alert a = driver.switchTo().alert();
		a.dismiss();
		
	}

	public void switchcontrolto() {

		driver.switchTo().defaultContent();
	}

	public String getProjectPath() {

		return System.getProperty("user.dir");

	}

	public String getPropertyfileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\config\\config.properties"));
		String value = (String) properties.get(key);
		return value;

	}

	
	public void elementclickJs(WebElement element) {
		
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView(true)",element);
    	
    }
	
	public static void browserLaunch(String browsertype) {

		switch (browsertype) {

		case "chrome":

			driver = new ChromeDriver();

			break;

		case "firefox":

			driver = new FirefoxDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		case "ie":

			driver = new InternetExplorerDriver();

			break;

		default:
			break;
		}

	}

}
