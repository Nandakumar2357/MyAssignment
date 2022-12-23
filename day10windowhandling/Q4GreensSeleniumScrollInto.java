package org.day10windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4GreensSeleniumScrollInto {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement scrollDown = driver.findElement(By.xpath("(//h3[@id='Python-Solutions-Architect-Training'])[4]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		js.executeScript("arguments[0].click()", scrollDown);
		
		WebElement click = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()",click);
		
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		
		
		
	}

}
