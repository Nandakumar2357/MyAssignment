package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void launchWebsite(String string) {
		driver.get(string);
	}
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void printCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void sendKey(WebElement elementRef, String value) {
		elementRef.sendKeys(value);
	}
	public static void btnClick(WebElement clickRef) {
		clickRef.click();
	}
	public static void dClick(WebElement doubleClickRef) {
		Actions acc = new Actions(driver);
		acc.doubleClick().perform();
	}
	public static void rightClick(WebElement rightClickRef) {
		Actions acc = new Actions(driver);
		acc.contextClick(rightClickRef);
	}
	public static void dragAndDrop(WebElement sourceRef, WebElement destRef) {
		Actions acc = new Actions(driver);
		acc.dragAndDrop(sourceRef, destRef);
	}
	public static void mouseHover(WebElement hoverRef) {
		Actions acc = new Actions(driver);
		acc.moveToElement(hoverRef);
	}
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public static void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public static void promptAlert(String msg) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(msg);
		a.accept();
	}
	public static void printText(WebElement textRef) {
		String text = textRef.getText();
		System.out.println(text);
	}
	public static void printAttributeValue(WebElement attributeRef) {
		String attribute = attributeRef.getAttribute("value");
		System.out.println(attribute);
	}
	public static void selectByIndex(WebElement indexRef, int index) {
		Select sel = new Select(indexRef);
		sel.selectByIndex(index);
	}
	public static void selectByText(WebElement textRef, String text) {
		Select sel = new Select(textRef);
		sel.selectByVisibleText(text);
	}
	public static void selectByValue(WebElement valueRef, String value) {
		Select sel = new Select(valueRef);
		sel.selectByValue(value);
	}
	public static void getAllDropDownOptions(WebElement ref) {
		Select sel = new Select(ref);

		List<WebElement> allOptions = sel.getOptions();

		for (WebElement webElement : allOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public static void switchWindow() {
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> windowId = new ArrayList();
		windowId.addAll(allIds);
		driver.switchTo().window(windowId.get(1));
	}

	public static void goToParentWindow() {
		// driver.switchTo().window(parentId);
	}

	public static void closeCurrentTab() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void naviToUrl(String url) {
		Navigation navigate = driver.navigate();
		navigate.to(url);
	}

	public static void naviForward() {
		driver.navigate().forward();
	}

	public static void naviBack() {
		driver.navigate().back();
	}

	public static void refeshPage() {
		driver.navigate().refresh();
	}

	public static void pageWait(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void robotKey(int keyCode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keyCode);
	}

	public static void javaScriptSendKeys(String text, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + text + "')", ref);
	}

	public static void javaScriptGetAttribute() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')");
	}

	public static void javaScriptClick(WebElement clickRef) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", clickRef);
	}

	public static void scrollDown(WebElement scrollRef) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollRef);
	}

	public static void scrollUp(WebElement scrollRef) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollRef);
	}

	public static void framesString(String frameRef) {
		driver.switchTo().frame(frameRef);
	}

	public static void framesWebElement(WebElement elementRef) {
		driver.switchTo().frame(elementRef);
	}

	public static void framesIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static String excelRead(String pathname, String sheetname, int rowNo, int cellNo) throws IOException {
		File file =new File(pathname);
		FileInputStream finput =new FileInputStream(file);
		Workbook w =new XSSFWorkbook(finput);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String cellValue = cell.getStringCellValue();
		return cellValue;
	}
	
	public static String excelRead2(int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\TestData.xlsx");
		FileInputStream finput =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(finput);
		Sheet sheet = w.getSheet("Data");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();
		String text = "";
		if (type==1) {
			text = cell.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			
			SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
			text = sim.format(date);
		}else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			text = String.valueOf(l);
		}
		return text;
	}
	
	public static void excelWrite(String name, int rowNo, int cellNo) throws IOException {
		File file=new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\StudentDetails.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("excel Read");
		Row row = s.createRow(rowNo);
		Cell c1 = row.createCell(cellNo);
		c1.setCellValue(name);
		FileOutputStream fout=new FileOutputStream(file);
		w.write(fout);
		
}
	public static void updateTheCellValue(int rowNo, int cellNo, String value) throws IOException {
		File file =new File("./excel/TestData.xlsx");
		FileInputStream finput =new FileInputStream(file);
		Workbook w =new XSSFWorkbook(finput);
		Sheet sheet = w.getSheet("Data");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(value);
		FileOutputStream foutput = new FileOutputStream(file);
		w.write(foutput);
		
	}
	public static void webPageWaiting(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
}


