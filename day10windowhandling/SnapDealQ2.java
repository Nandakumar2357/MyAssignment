package org.day10windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealQ2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");

	driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("iphone 7");
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")).click();
	driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Soft Silicon Cases Wow Imagine - Blue']")).click();

	String parentId = driver.getWindowHandle();
	Set<String> allId = driver.getWindowHandles();
	for (String s : allId) {
		if (!parentId.equals(s)) {
			driver.switchTo().window(s);
			
		}
		
	}
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	WebElement printText = driver.findElement(By.xpath("(//span[text()='Rs. 279'])[2]"));
	String print = printText.getText();
	System.out.println(print);
	
	
	
	
	
}
}
