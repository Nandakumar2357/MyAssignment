package org.day10windowhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13GreensFrameworkTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("(//i[@class='fas fa-plus']/parent::div)[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' TESTNG']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		List<String> windowId =new ArrayList<>();
				windowId.addAll(allIds);
		driver.switchTo().window(windowId.get(1));
		
		
		
	}

}
