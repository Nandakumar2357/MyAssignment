package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		userName.click();
		
		WebElement search = driver.findElement(By.xpath	("//input[@class = 'nav-input nav-progressive-attribute']"));
		search.sendKeys("iphone");
		
		WebElement searClick =driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']"));
		searClick.click();
	}

}
