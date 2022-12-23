package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q19FlipkartMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		Thread.sleep(3000);
		WebElement mobileMover = driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
		Actions a = new Actions(driver);
		a.moveToElement(mobileMover).perform();
		
		//unable to click Mi element
		
		WebElement realMe = driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[1]"));
		a.moveToElement(realMe).perform();
		realMe.click();
		
	}

}
