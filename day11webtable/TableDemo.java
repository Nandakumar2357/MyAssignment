package org.day11webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		System.out.println("No of Tables :" +tables.size());
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			
		
		List<WebElement> headings = row.findElements(By.tagName("th"));
		for (int j = 0; j <headings.size() ; j++) {
			WebElement heading = headings.get(j);
			System.out.println(heading.getText());
			
		}
	}
	}
}

