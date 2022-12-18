package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarTradePojo  extends BaseClass{
	public CarTradePojo() {
		PageFactory.initElements(driver, this);	
		}
@FindBy(xpath="//select[@id='ucity']")
private WebElement LocationRef;

@FindBy(xpath="(//input[@type='submit'])[2]")
private WebElement searchIcon;

public WebElement getLocationRef() {
	return LocationRef;
}

public WebElement getSearchIcon() {
	return searchIcon;
}





}
