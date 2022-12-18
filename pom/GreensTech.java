package org.pom;

import org.baseclass.BaseClass;
import org.pojo.Greens1Pojo;

public class GreensTech extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	launchBrowser();
	maximize();
	launchWebsite("http://www.greenstechnologys.com/");
	
	Greens1Pojo gp =new Greens1Pojo();
	
	scrollDown(gp.getTxtGreensTech());
	printText(gp.getTxtGreensTech());
	scrollUp(gp.getTxtGreensSoft());
	printText(gp.getTxtGreensSoft());
	
	btnClick(gp.getClkcertification());
	btnClick(gp.getClkCourseContent());
	scrollDown(gp.getPrintTxt1());
	printText(gp.getPrintTxt1());
	printText(gp.getPrintSelenium());
	
	scrollUp(gp.getmOverCourse());
	mouseHover(gp.getmOverCourse());
	mouseHover(gp.getmOverJavaTrang());
	mouseHover(gp.getmOverCoreJava());
	javaScriptClick(gp.getmOverCoreJava());
	
	printText(gp.getmOverReview());	
	btnClick(gp.getClkCarrer());
	scrollDown(gp.getPrintEmail());
	printText(gp.getPrintEmail());
	
	scrollUp(gp.getClkContactUs());
	btnClick(gp.getClkContactUs());
	switchWindow();
	printText(gp.getPrintMainBranch());
	scrollDown(gp.getPrintCopyRights());
	printText(gp.getPrintCopyRights());
	
	
	
	
	
}
}
