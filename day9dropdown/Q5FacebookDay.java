package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5FacebookDay {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\RadhaSeleniumTask\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement dayIcon = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
		Select s=new Select(dayIcon);
		List<WebElement> allDays = s.getOptions();
		for (int i = 0; i < allDays.size(); i++) {
			if (i%2==1) {
				WebElement datePrint = allDays.get(i);
				String text = datePrint.getText();
				System.out.println(text);
			}
			
		}
		
		
		
		
	}

}
