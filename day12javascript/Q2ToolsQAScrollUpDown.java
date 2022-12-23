package org.day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2ToolsQAScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://toolsqa.com/");
	
	
	WebElement findElement = driver.findElement(By.xpath("//div[text()='support@toolsqa.com']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", findElement);
	Thread.sleep(3000);
	
	WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
	js.executeScript("arguments[0].scrollIntoView(false)", findElement2);
	
	
	
	
	
	}
}
