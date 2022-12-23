package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebokPrintTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("nandakumar123@gmail.com");
		
		WebElement passWor =driver.findElement(By.id("pass"));
		passWor.sendKeys("asdfre@123");
	
		String text =userName.getAttribute("value");
		System.out.println(text);
		
		String text2 =passWor.getAttribute("value");
		System.out.println(text2);
		
		
	}

}
