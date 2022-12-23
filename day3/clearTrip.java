package org.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearTrip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	
	driver.manage().window().maximize();
	
	WebElement fromPlace=driver.findElement(By.xpath("//input[@id = 'from_station']"));
	fromPlace.sendKeys("Chennai");
	
	WebElement toPlace = driver.findElement(By.xpath("//span[@class='ui-widget span span24']/input"));
	toPlace.sendKeys("Mumbai");
	
	driver.findElement(By.xpath("//button[text() = 'Search trains']")).click();
	
	
	
	
	
	
}	

}
