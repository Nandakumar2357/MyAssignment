package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCourse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course=driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions find =new Actions(driver);
		find.moveToElement(course).perform();
		
		WebElement softTest = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		find.moveToElement(softTest).perform();
		
		WebElement certificateTraining = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		find.moveToElement(certificateTraining);
		
		certificateTraining.click();
	}

}
