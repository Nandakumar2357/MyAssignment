package org.day7sceenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4GreensScreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement element = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	
	TakesScreenshot ss=(TakesScreenshot)driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File dest =new File("C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\SeleniumFile\\\\screenshot\\\\greensPerumbkm.jpg");
	FileUtils.copyFile(src, dest);
			
	
	
}
}
