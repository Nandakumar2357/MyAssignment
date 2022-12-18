package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingPagePojo extends BaseClass {
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClickBookNow() {
		return clickBookNow;
	}

	public WebElement getPrintOrderNo() {
		return printOrderNo;
	}

	public AdactinBookingPagePojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccNumber;

	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ccType;

	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ccMonth;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ccYear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath="//input[@id='book_now']")
	private WebElement clickBookNow;

	@FindBy(xpath="//input[@id='order_no']")
	private WebElement printOrderNo;


	

}
