package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q17FlipkartWomen {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement fashion=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();

		WebElement womenSlipper=driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(womenSlipper).perform();
		
		WebElement flatSlipper = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		a.moveToElement(flatSlipper).perform();
		flatSlipper.click();

		}
		}



