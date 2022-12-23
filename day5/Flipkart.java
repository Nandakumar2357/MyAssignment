package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement homeButton = driver.findElement(By.xpath("//img[@alt='Home']"));
		
		//driver.switchTo().frame("login_page");
		Actions acc =new Actions(driver);
		acc.moveToElement(homeButton).perform();
		WebElement bathLinen =driver.findElement(By.xpath("//a[text()='Bath linen']"));
		acc.moveToElement(bathLinen).perform();
		bathLinen.click();
		
		Thread.sleep(5000);
		
		WebElement towel = driver.findElement(By.xpath("(//a[contains(text(),'byPurenaturals Bamboo')])[2]"));
		String printTxt = towel.getText();
		System.out.println(printTxt);
		
		//Unable to print Product Name in console
	}

}
