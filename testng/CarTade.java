package org.testng;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.CarTradePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTade extends BaseClass {

	@BeforeClass
	private void launchThe() {
		launchBrowser();
		maximize();
	}

	@AfterClass
	private void closeTheBrowser() {
		quitBrowser();
	}

	/*@Test
	private void searchCar() {
		launchWebsite("https://www.cartrade.com/");
		CarTradePojo car = new CarTradePojo();
		selectByText(car.getLocationRef(), "Mumbai");
		btnClick(car.getSearchIcon());
		List<WebElement> carNames = driver.findElements(By.xpath("//a[@data-label='stock.ProfileId']"));
		List<WebElement> carPrices = driver.findElements(By.xpath("//div[@class='cr_prc']"));

		for (int i = 0; i < carNames.size(); i++) {
			
			for (int j = 0; j < carPrices.size(); j++) {
			if (i==j) {
			System.out.println(carNames.get(i).getText());	
			System.out.println(carPrices.get(j).getText());
			}
				
			}

		}
		
	}*/
}
