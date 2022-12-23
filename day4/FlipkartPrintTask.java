package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrintTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(7000);
		
		
		WebElement userName =driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN']/input)[1]"));
		userName.sendKeys("nandakumarp");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
				pass.sendKeys("abcd@1234");
		
		String text =userName.getAttribute("value");
		System.out.println(text);
		
		String text2 =pass.getAttribute("value");
		System.out.println(text2);
	}

}
