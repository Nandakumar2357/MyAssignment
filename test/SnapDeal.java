package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\SeleniumFile\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("nandaapharm@gmail.com");
		
	}

}
