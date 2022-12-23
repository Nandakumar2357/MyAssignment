package org.day10windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11FlipkartHpLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("hp laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T']/parent::div)[1]")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> windowId =new ArrayList<>();
				windowId.addAll(allIds);
		driver.switchTo().window(windowId.get(1));
		
		WebElement printPrice = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = printPrice.getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
