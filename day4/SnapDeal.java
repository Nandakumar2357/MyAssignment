package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@placeholder='Search products & brands']")).sendKeys("Jeans");
	
	driver.findElement(By.xpath("//span[text() = 'Search']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//p[contains(text(), 'Grey 100% Cotton Regular Fit Men')])[1]")).click();
	
	
	}

}
