package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopClues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@id='search']/input")).sendKeys("Wireless Bluetooth");
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h2[contains(text(), 'Maasarent 600 Mbps')]")).click();
		
		
		
	}

}
