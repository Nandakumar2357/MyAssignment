package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
	
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
	}
}
