package org.day10windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6GreensFrameworkJunit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.findElement(By.xpath("//div[@id='heading304']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' JUNIT']")).click();
		
		
		
	}

}