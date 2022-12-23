package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");		
		driver.manage().window().maximize();
		
		WebElement firstSource =driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement firstDest   =driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement secondSource =driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement secondDest   =driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(firstSource, firstDest).dragAndDrop(secondSource, secondDest).perform();
		
		
		
	}

}
