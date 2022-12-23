package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id = 'email']"));
		username.sendKeys("nanda");
		
		WebElement pass = driver.findElement(By.xpath("//input[@class = 'inputtext _55r1 _6luy _9npi']"));
		pass.sendKeys("asd1234");
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		login.click();
	}

}
