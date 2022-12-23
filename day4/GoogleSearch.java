package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("greens Velmurugan");
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//h3[contains(text(), 'Technical Manager')]")).click();
		
	}

}
