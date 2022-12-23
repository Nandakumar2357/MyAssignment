package org.day10windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8SnapDealSanitizer {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");

	driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("hand sanitizer");
	driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-search-under-catagory lfloat']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//div[@class='product-tuple-description ']//a)[1]")).click();
	
	String parentId = driver.getWindowHandle();
	Set<String> allId = driver.getWindowHandles();
	for (String id : allId) {
		if (!parentId.equals(id)) {
			driver.switchTo().window(id);
			
		}
	}
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	}
}
