package org.day11webtable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q3NoOfRows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	
	WebElement table= driver.findElement(By.tagName("table"));
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
		int size = rows.size();
		System.out.println("No of Rows in Table : "+size);
		
	}
	
	
	
}

