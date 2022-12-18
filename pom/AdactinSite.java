package org.pom;

import org.baseclass.BaseClass;
import org.pojo.AdactinBookingPagePojo;
import org.pojo.AdactinHotelPojo;

public class AdactinSite extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		maximize();
		launchWebsite("http://adactinhotelapp.com/");
		
		AdactinHotelPojo ap =new AdactinHotelPojo();
		sendKey(ap.getTxtUsername(), "Vijay12378");
		sendKey(ap.getTxtPassWord(), "Vijay123");
		btnClick(ap.getClkLogin());	
		
		selectByText(ap.getLocationRef(), "Melbourne");
		selectByText(ap.getHotelRef(), "Hotel Sunshine");
		selectByText(ap.getRoomType(), "Deluxe");
		selectByText(ap.getNoOfRoom(), "1 - One");
		javaScriptSendKeys("03/12/2022", ap.getCheckInDate());
		javaScriptSendKeys("04/12/2022", ap.getCheckOutDate());
		selectByText(ap.getAdultRoom(), "1 - One");
		btnClick(ap.getClickSearch());
		btnClick(ap.getRadioBtnClick());
		btnClick(ap.getClickContinue());
		
		AdactinBookingPagePojo bp =new AdactinBookingPagePojo();	
		sendKey(bp.getFirstName(), "Nandaaaaa");
		sendKey(bp.getLastName(), "kumarrr");
		sendKey(bp.getAddress(), "chennaiii");
		sendKey(bp.getCcNumber(), "2351 2546 5426 2451");
		
		selectByText(bp.getCcType(), "VISA");
		selectByText(bp.getCcMonth(), "February");
		selectByText(bp.getCcYear(), "2022");
		
		sendKey(bp.getCvv(), "215");
		btnClick(bp.getClickBookNow());
		Thread.sleep(6000);
		
		
		
		
		
		
	}

}
