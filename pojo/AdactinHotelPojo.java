package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelPojo extends BaseClass{
public AdactinHotelPojo() {
	PageFactory.initElements(driver, this);	
}

@FindBy(xpath="//input[@id='username']")
private WebElement txtUsername;

@FindBy(xpath="//input[@id='password']")
private WebElement txtPassWord;

@FindBy(xpath="//input[@id='login']")
private WebElement clkLogin;

@FindBy(xpath="//select[@id='location']")
private WebElement locationRef;

@FindBy(xpath="//select[@id='hotels']")
private WebElement hotelRef;

@FindBy(xpath="//select[@id='room_type']")
private WebElement roomType;

@FindBy(xpath="//select[@id='room_nos']")
private WebElement noOfRoom;

@FindBy(xpath="//input[@id='datepick_in']")
private WebElement checkInDate;

@FindBy(xpath="//input[@id='datepick_out']")
private WebElement checkOutDate;

@FindBy(xpath="//select[@id='adult_room']")
private WebElement adultRoom;

@FindBy(xpath="//input[@id='Submit']")
private WebElement clickSearch;

@FindBy(xpath="//input[@id='radiobutton_0']")
private WebElement RadioBtnClick;

@FindBy(xpath="//input[@id='continue']")
private WebElement clickContinue;

public WebElement getTxtUsername() {
	return txtUsername;
}

public WebElement getTxtPassWord() {
	return txtPassWord;
}

public WebElement getClkLogin() {
	return clkLogin;
}

public WebElement getLocationRef() {
	return locationRef;
}

public WebElement getHotelRef() {
	return hotelRef;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoOfRoom() {
	return noOfRoom;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public WebElement getAdultRoom() {
	return adultRoom;
}

public WebElement getClickSearch() {
	return clickSearch;
}

public WebElement getRadioBtnClick() {
	return RadioBtnClick;
}

public WebElement getClickContinue() {
	return clickContinue;
}












}
