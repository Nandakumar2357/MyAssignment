package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("one plus blutooth");
		
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		
		
	}

}
