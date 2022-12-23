package org.day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6Flipkart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	//Thread.sleep(2000);
	
	
	WebElement userName =driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN']/input)[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value', 'nandakumar')", userName);
	
	
	/*WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].setAttribute('value', '123445')", pass);
	
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", userName);
	System.out.println(executeScript);
	
	Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", pass);
	System.out.println(executeScript2);*/
	
	
	
	
	
	
	
}
}
