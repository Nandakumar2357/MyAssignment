package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensResume {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	
	WebElement selectopt = driver.findElement(By.xpath("//div[@id ='heading201']/i"));
	selectopt.click();
	
	driver.findElement(By.xpath("//a[text() ='Resume Model-1 ']")).click();
	
	
	
	
	
	
	
}
	

}
