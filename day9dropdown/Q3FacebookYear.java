package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3FacebookYear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\RadhaSeleniumTask\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement yearIcon = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s = new Select(yearIcon);
		
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement webElement : allOptions) {
			String year = webElement.getText();
			System.out.println(year);
		}
		
	}

}
