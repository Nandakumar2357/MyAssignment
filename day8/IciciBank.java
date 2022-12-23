package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya\\eclipse-workspace\\SeleniumFile\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='Login using User ID and password']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("nandaakumar");
		
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("abcd@123");
		
		driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']")).click();
	}

}
