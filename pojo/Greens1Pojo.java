package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Greens1Pojo extends BaseClass{

	public Greens1Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement txtGreensTech;
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement txtGreensSoft;
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement clkcertification;
	@FindBy(xpath="(//a[text()='Course Content'])[40]")
	private WebElement clkCourseContent;
	@FindBy(xpath="//p[contains(text(),'Call +91 89399-15577 for more details.')]")
	private WebElement printTxt1;
	@FindBy(xpath="//b[text()='Learn Selenium Training In Chennai From The Experts!']")
	private WebElement printSelenium;
	public WebElement getTxtGreensTech() {
		return txtGreensTech;
	}
	public WebElement getTxtGreensSoft() {
		return txtGreensSoft;
	}
	public WebElement getClkcertification() {
		return clkcertification;
	}
	public WebElement getClkCourseContent() {
		return clkCourseContent;
	}
	public WebElement getPrintTxt1() {
		return printTxt1;
	}
	public WebElement getPrintSelenium() {
		return printSelenium;
	}
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement mOverCourse;
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement mOverJavaTrang;
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement mOverCoreJava;
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement mOverReview;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement clkCarrer;
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[1]")
	private WebElement printEmail;
	
	@FindBy(xpath="(//a[contains(text(),'Contact Us')])[1]")
	private WebElement clkContactUs;
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement printMainBranch;
	@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement printCopyRights;
	public WebElement getmOverCourse() {
		return mOverCourse;
	}
	public WebElement getmOverJavaTrang() {
		return mOverJavaTrang;
	}
	public WebElement getmOverCoreJava() {
		return mOverCoreJava;
	}
	public WebElement getmOverReview() {
		return mOverReview;
	}
	public WebElement getClkCarrer() {
		return clkCarrer;
	}
	public WebElement getPrintEmail() {
		return printEmail;
	}
	public WebElement getClkContactUs() {
		return clkContactUs;
	}
	public WebElement getPrintMainBranch() {
		return printMainBranch;
	}
	public WebElement getPrintCopyRights() {
		return printCopyRights;
	}
	
}
