package org.day9dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q6Guru99Country {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\RadhaSeleniumTask\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement countryName = driver.findElement(By.xpath("//select[@name='country']"));
		Select s=new Select(countryName);
		List<WebElement> allCountry = s.getOptions();
		for (WebElement c : allCountry) {
			String text = c.getAttribute("value");
			System.out.println(text);
		}
		
		
	}

}
