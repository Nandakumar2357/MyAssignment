package org.day9dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q13FruitsEven {
public static void main(String[] args) {
	System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\RadhaSeleniumTask\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://output.jsbin.com/osebed/2");
	
	WebElement fruitList = driver.findElement(By.xpath("//select[@id='fruits']"));
	
	Select s=new Select(fruitList);
	s.selectByVisibleText("Banana");
	s.selectByVisibleText("Apple");
	s.selectByVisibleText("Orange");
	s.selectByVisibleText("Grape");
	
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	
	
	
	
}
}
