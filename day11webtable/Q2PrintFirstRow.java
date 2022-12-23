package org.day11webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2PrintFirstRow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement tables = driver.findElement(By.tagName("table"));
		List<WebElement> rows = tables.findElements(By.tagName("tr"));
		for (int i = 0; i <1; i++) {
			WebElement row = rows.get(i);
			
			List<WebElement> data = row.findElements(By.tagName("td"));
			for (int j = 0; j < data.size(); j++) {
				WebElement datum = data.get(j);
				System.out.println(datum.getText());
				
			}
		}
		
		
		
		
		
		
	}

}