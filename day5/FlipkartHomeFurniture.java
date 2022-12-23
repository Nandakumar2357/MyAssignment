package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHomeFurniture {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement mOverHome=driver.findElement(By.xpath("//img[@alt='Home']"));
		
		Actions find = new Actions(driver);
		find.moveToElement(mOverHome).perform();
		
		Thread.sleep(3000);
		WebElement bedLinen = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[4]"));
		
		find.moveToElement(bedLinen).click();
		
		
		
	}

}
