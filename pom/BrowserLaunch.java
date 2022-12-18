package org.pom;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LoginPagePojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass {
	
	public static void main(String[] args) {
		
	launchBrowser();
	maximize();
	launchWebsite("https://wwww.facebook.com/");
	
	LoginPagePojo l=new LoginPagePojo();
	sendKey(l.getTxtUsername(), "nanda");
	sendKey(l.getTxtPassword(), "abcd@123");
	btnClick(l.getBtnClick());
	
	
	
	
	
	
	}
}
