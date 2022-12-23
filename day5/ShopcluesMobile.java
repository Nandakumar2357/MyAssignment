package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopcluesMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement mOverMobile=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		
		Actions find =new Actions(driver);
		find.moveToElement(mOverMobile).perform();
		
		
		WebElement smartPhone = driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]"));
		
		find.moveToElement(smartPhone).perform();
		Thread.sleep(3000);
		smartPhone.click();
		
		 
		
	}

}
