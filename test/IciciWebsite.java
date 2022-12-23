package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciWebsite {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("DUMMY1"));
			userName.click();
			
		WebElement enterUsername =driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
			enterUsername.sendKeys("nandakumar");
			
		WebElement password = driver.findElement(By.className("login-input-password"));
			password.sendKeys("abcd123");
		
		
		
		
		
		
		
		
		
		
		
	}

}
