package org.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		// Windows Handling Program
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sanitizer 5 Litre");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath(
				"(//span[text()='FLOH Sharp Rub Hand Sanitizer 5 Liter Alcohol Based with 500ML Hand Sanitizer Spray with Lemon Flavor & 70% Alcohol, Hand Sanitizer'])[1]"))
				.click();

		String parentId = driver.getWindowHandle();

		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			if (!parentId.equals(id)) {
				driver.switchTo().window(id);

			}

		}
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();

		driver.close();

		driver.switchTo().window(parentId);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hello");

	}

}
