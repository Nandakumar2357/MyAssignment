package org.day4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement buttonClick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		buttonClick.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("iphone13");
		
		WebElement clickSearch =driver.findElement(By.xpath("//button[@type='submit']"));
		clickSearch.click();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 256 GB)']"));
		Actions acc=new Actions(driver);
		acc.contextClick(element);

		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
