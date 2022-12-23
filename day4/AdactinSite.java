package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("nandakumar");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("asdhkj@123");
		
		String userText = user.getAttribute("value");
		System.out.println(userText);
		
		String passText = pass.getAttribute("value");
		System.out.println(passText);
		
		
		
		
		
		
		
		
	}

}
