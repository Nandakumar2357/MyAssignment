package org.day12javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5AdactinSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'nandakumar' )", findElement);
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id='password']"));
		js.executeScript("arguments[0].setAttribute('value', '12345')", findElement2);
		
		WebElement findElement3 = driver.findElement(By.xpath("//input[@id='login']"));
		js.executeScript("arguments[0].click()", findElement3);
		
		
		
		
	}

}
