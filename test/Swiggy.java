package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("Kovilambakkam");
		
		Thread.sleep(2000);
		WebElement clearButton = driver.findElement(By.className("NqZN6"));
		clearButton.click();
		
		
		
		
		
		
		
		
		
		
	}

}
