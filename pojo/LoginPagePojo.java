package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePojo extends BaseClass{
	
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="email")
	private WebElement txtUsername;
	
	@FindBy(id ="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement btnClick;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
	

}
