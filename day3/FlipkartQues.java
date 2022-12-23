package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartQues {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@class ='_2IX_2- VJZDxU']")).sendKeys("Nandakumar");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nnand123");
	
	driver.findElement(By.xpath("(//button[@type ='submit'])[2]")).click();
	
	}

}
