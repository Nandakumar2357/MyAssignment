package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'with Textbox')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the')]")).click();
		
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("Nandakumar");
		
		a.accept();
		
		
		
		
	}

}
