package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationSite {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firName = driver.findElement(By.xpath("//input[@placeholder = 'First Name']"));
		firName.sendKeys("Nanda");
		
		WebElement lasName = driver.findElement(By.xpath("//input[@ng-model = 'LastName']"));
		lasName.sendKeys("Kumar");
		
		WebElement lasName1 = driver.findElement(By.xpath("//textarea[@class = 'form-control ng-pristine ng-untouched ng-valid']"));
		lasName1.sendKeys("Kovilambakkam");
		
		WebElement lasName2 = driver.findElement(By.xpath("//input[@ng-model = 'EmailAdress']"));
		lasName2.sendKeys("nanda@gmail.com");
		
		WebElement lasName3 = driver.findElement(By.xpath("//input[@type = 'tel']"));
		lasName3.sendKeys("9884561235");
		
		WebElement lasName4 = driver.findElement(By.xpath("(//input[@name = 'radiooptions'])[1]"));
		lasName4.click();
		
		WebElement lasName5 = driver.findElement(By.id("checkbox2"));
		lasName5.click();
		
		WebElement lasName6 = driver.findElement(By.id("msdd"));
		lasName6.click();
		
		WebElement lasName7 = driver.findElement(By.xpath("(//a[@style = 'text-decoration:none'])[8]"));
		lasName7.click();
		
		WebElement lasName8 = driver.findElement(By.id("Skills"));
		lasName8.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
