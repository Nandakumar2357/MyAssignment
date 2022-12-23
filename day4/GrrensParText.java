package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrrensParText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
	
		WebElement findText = driver.findElement(By.xpath("//p[contains(text(), 'leading Training')]"));
		String print=findText.getText();
		System.out.println(print);
		
		
		
		
		
	}

}
