package org.testng;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojo.AdactinBookingPagePojo;
import org.pojo.AdactinHotelPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class AdatinHotelLogin extends BaseClass{
	
	@BeforeClass
	public static void launchBrowsers() {
		launchBrowser();
		maximize();	}
	@AfterClass
	public static void closeBrowser() {
	quitBrowser();
	}
	@Test(priority=1)
	private void LoginIn() throws IOException {
		launchWebsite("http://www.adactin.com/HotelApp/");
		AdactinHotelPojo ap=new AdactinHotelPojo();
		sendKey(ap.getTxtUsername(), excelRead2(0, 0));
		sendKey(ap.getTxtPassWord(), excelRead2(0, 1));
		btnClick(ap.getClkLogin());
	}
	@Test(priority=2)
	private void searchHotel() throws IOException {
		AdactinHotelPojo ap=new AdactinHotelPojo();
		selectByText(ap.getLocationRef(), excelRead2(0, 2));
		selectByText(ap.getHotelRef(), excelRead2(0, 3));
		selectByText(ap.getRoomType(), excelRead2(0, 4));
		selectByText(ap.getNoOfRoom(), excelRead2(0, 5));
		javaScriptSendKeys(excelRead2(0, 6), ap.getCheckInDate());
		javaScriptSendKeys(excelRead2(0, 7), ap.getCheckOutDate());
		selectByText(ap.getAdultRoom(), excelRead2(0, 8));
		btnClick(ap.getClickSearch());
		btnClick(ap.getRadioBtnClick());
		btnClick(ap.getClickContinue());	}
	@Test(priority=3)
	private void hotelBooking() throws IOException {
		AdactinBookingPagePojo bp =new AdactinBookingPagePojo();
		sendKey(bp.getFirstName(), excelRead2(0, 9));
		sendKey(bp.getLastName(), excelRead2(0, 10));
		sendKey(bp.getAddress(), excelRead2(0, 11));
		sendKey(bp.getCcNumber(), excelRead2(0, 12));
		}
	@Test(priority=4)
	private void cardDetails() throws IOException, InterruptedException {
		AdactinBookingPagePojo bp =new AdactinBookingPagePojo();
		selectByText(bp.getCcType(),excelRead2(0, 13));
		selectByText(bp.getCcMonth(), excelRead2(0, 14));
		selectByText(bp.getCcYear(), excelRead2(0, 15));
		sendKey(bp.getCvv(), excelRead2(0, 16));
		btnClick(bp.getClickBookNow());
		Thread.sleep(7000);
	}
	@Test(priority=5)
	private void printOrderNo() throws IOException {
		AdactinBookingPagePojo bp =new AdactinBookingPagePojo();
		updateTheCellValue(0, 17, bp.getPrintOrderNo().getAttribute("value"));
		
	}

}
