package org.day10windowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonIphoneX {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
		driver.findElement(By.id("nav-search-submit-text")).click();
		WebElement clickIphone = driver.findElement(
				By.xpath("//span[text()='Apple iPhone XS, US Version, 256GB, Space Gray - Unlocked (Renewed)']"));

		Actions a = new Actions(driver);
		a.contextClick(clickIphone).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			if (!parentId.equals(id)) {
				driver.switchTo().window(id);
				System.out.println("Switched to new window");

			}

		}
		WebElement textPrint = driver.findElement(By.xpath("//div[@style='display: block;']"));
		String text = textPrint.getText();
		System.out.println(text);

	}

}
