package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCourseRpa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement course=driver.findElement(By.xpath("//div[@title='Courses']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(course).perform();
	
	WebElement rpa =driver.findElement(By.xpath("//span[text()='RPA (6)']"));
	acc.moveToElement(rpa).perform();
	
	WebElement bluePrism =driver.findElement(By.xpath("//span[contains(text(),'Prism Certification')]"));
	acc.moveToElement(bluePrism).perform();
	bluePrism.click();
	
	
	
	
	
	
	
	
}
}
