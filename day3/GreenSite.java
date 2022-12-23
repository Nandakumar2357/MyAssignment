package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenSite {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement selectopt = driver.findElement(By.xpath("//i[@class = 'fas fa-plus']"));
		selectopt.click();
		
		Thread.sleep(2000);
		WebElement ctsQues = driver.findElement(By.xpath("(//a[@title = 'Interview Questions'])[6]"));
		ctsQues.click();
		
	}

}
