package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8798765430");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nanda");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jlkdasysii@gmail.com");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
}
}
