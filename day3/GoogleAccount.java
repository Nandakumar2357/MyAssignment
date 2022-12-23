package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("Nanda");
		
		driver.findElement(By.xpath("//input[@name ='lastName']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//input[@name ='Username']")).sendKeys("Kovilambakkam123434");
		
		driver.findElement(By.xpath("//input[@name ='Passwd']")).sendKeys("Nanda@123");
		
		driver.findElement(By.xpath("//input[@name ='ConfirmPasswd']")).sendKeys("Nanda@123");
	
		
	}

}
