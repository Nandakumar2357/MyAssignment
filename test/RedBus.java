package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement fromPlace = driver.findElement(By.className("db"));
		fromPlace.sendKeys("Chennai");
		
		WebElement toPlace = driver.findElement(By.id("dest"));
		toPlace.sendKeys("Madurai");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
