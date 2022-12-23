package org.day7sceenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12Snapdeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("HP Laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\screenshot\\snapdeal.jpg");
		FileUtils.copyFile(source, dest);
		
		
		
		
	}

}
