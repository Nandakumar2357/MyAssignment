package org.day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'nandakumar')", findElement);
		//Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value', '1234')", findElement2);
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()", findElement3);
		
		
	}

}
