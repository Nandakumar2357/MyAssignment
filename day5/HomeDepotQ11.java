package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepotQ11 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.homedepot.com/");
	
	WebElement department =driver.findElement(By.xpath("//a[text()='All Departments']"));
	Actions a =new Actions(driver);
	a.moveToElement(department).perform();
	
	WebElement heating =driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
	a.moveToElement(heating).perform();
	
	WebElement airCond =driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
	a.moveToElement(airCond).perform();
	
	WebElement portAirCond =driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
	a.moveToElement(portAirCond).perform();
	portAirCond.click();
	
	
	
	
	
	
	
	
}
}
