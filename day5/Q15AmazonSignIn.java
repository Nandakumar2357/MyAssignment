package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q15AmazonSignIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions mouseOver = new Actions(driver);
		mouseOver.moveToElement(signIn).perform();
		
		WebElement signInMover = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		mouseOver.moveToElement(signInMover).perform();
			
		
	}

}
