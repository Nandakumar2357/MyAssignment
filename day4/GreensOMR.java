package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOMR {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement adyar = driver.findElement(By.xpath("//h6[@class = 'widget-title ']"));
		String text = adyar.getText();
		System.out.println(text);
		
		WebElement address = driver.findElement(By.xpath("(//p[@class ='mail-info'])[1]"));
				String text2 = address.getText();
				System.out.println(text2);
				
				System.out.println("==============================");
				
				WebElement omrAddr =driver.findElement(By.xpath("(//div[@class ='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
				String text3 = omrAddr.getText();
				System.out.println(text3);
	
	
	}

}
