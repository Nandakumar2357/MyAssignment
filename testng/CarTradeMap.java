package org.testng;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.CarTradePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTradeMap extends BaseClass{
	@BeforeClass
	private void launchThe() {
		launchBrowser();
		maximize();
	}

	@AfterClass
	private void closeTheBrowser() {
		quitBrowser();
	}

	@Test
	private void searchCar() {
		launchWebsite("https://www.cartrade.com/");
		CarTradePojo car = new CarTradePojo();
		selectByText(car.getLocationRef(), "Mumbai");
		btnClick(car.getSearchIcon());
		List<WebElement> carNames = driver.findElements(By.xpath("//a[@data-label='stock.ProfileId']"));
		List<WebElement> carPrices = driver.findElements(By.xpath("//div[@class='cr_prc']"));
		
		Map<String, String> mp=new LinkedHashMap<String, String>();
		for (int i = 0; i < carNames.size(); i++) {
			WebElement carName = carNames.get(i);
			String name = carName.getText();
			
			WebElement amount = carPrices.get(i);
			String amt = amount.getText();
			mp.put(name, amt);
		}
		Set<Entry<String,String>> entrySet = mp.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		

}
}