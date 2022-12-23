package org.day9dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q8AdactinHotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\RadhaSeleniumTask\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vijay12378");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		WebElement locationRef = driver.findElement(By.xpath("//select[@id='location']"));
		Select objName = new Select(locationRef);
		objName.selectByVisibleText("Melbourne");
		
		WebElement hotelRef = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select locRef =new Select(hotelRef);
		locRef.selectByVisibleText("Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select locRef2 =new Select(roomType);
		locRef2.selectByVisibleText("Deluxe");
		
		WebElement noOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select locRef3 =new Select(noOfRoom);
		locRef3.selectByVisibleText("1 - One");
		
		WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '03/12/2022')",checkInDate);
		
		WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		js.executeScript("arguments[0].setAttribute('value', '04/12/2022')", checkOutDate);
		
		WebElement adultRoom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select locRef4 =new Select(adultRoom);
		locRef4.selectByVisibleText("1 - One");
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Nandaaaaa");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("kumarrr");
	
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("chennaiii");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("2351 2546 5426 2451");
		
		WebElement ccType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select sel =new Select(ccType);
		sel.selectByVisibleText("VISA");
		
		WebElement ccMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select sel2 =new Select(ccMonth);
		sel2.selectByVisibleText("February");
		
		WebElement ccYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select sel3 =new Select(ccYear);
		sel3.selectByVisibleText("2022");
		
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("215");
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(7000);
		WebElement printText = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = printText.getAttribute("value");
		System.out.println("Order No : " + attribute);
		
		
		
		
	}

}
