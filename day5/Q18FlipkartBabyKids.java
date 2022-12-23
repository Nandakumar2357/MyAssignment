package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q18FlipkartBabyKids {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement babyAndKids=driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));
		Actions a = new Actions(driver);
		a.moveToElement(babyAndKids).perform();
		
		WebElement toys = driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
		a.moveToElement(toys).perform();
		
		WebElement remoteCtrlToy=driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		a.moveToElement(remoteCtrlToy).perform();
		remoteCtrlToy.click();

		}
		}


