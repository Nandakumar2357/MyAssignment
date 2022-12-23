package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q13SnapDealMobile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement mobile =driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		Actions a =new Actions(driver);
		a.moveToElement(mobile).perform();
		
		WebElement cover =driver.findElement(By.xpath("//span[text()='Mobile Cases & Covers']"));
		a.moveToElement(cover).perform();
		cover.click();
		
		
		
		
		
	}
}
