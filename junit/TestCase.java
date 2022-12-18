package org.junit;

import java.util.Date;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPagePojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase extends BaseClass{
@BeforeClass
	public static void lauchBrowser() {
		launchBrowser();
		maximize();		

	}
	@Test	public void LogingIn() {
		launchWebsite("http://www.adactin.com/HotelApp/");
		/*LoginPagePojo lp =new LoginPagePojo();
		sendKey(lp.getTxtUsername(), "nandaaa");
		sendKey(lp.getTxtPassword(), "asc1235");
		btnClick(lp.getBtnClick());*/
		
	}
	
	
	
	
}
