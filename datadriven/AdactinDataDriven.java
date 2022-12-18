package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.pojo.AdactinBookingPagePojo;
import org.pojo.AdactinHotelPojo;

public class AdactinDataDriven extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		launchBrowser();
		maximize();
		launchWebsite("http://adactinhotelapp.com/");
		
		AdactinHotelPojo ap =new AdactinHotelPojo();
		sendKey(ap.getTxtUsername(),excelRead2(0, 0));
		sendKey(ap.getTxtPassWord(), excelRead2(0, 1));
		btnClick(ap.getClkLogin());
		
		selectByText(ap.getLocationRef(), excelRead2(0, 2));
		selectByText(ap.getHotelRef(), excelRead2(0, 3));
		selectByText(ap.getRoomType(), excelRead2(0, 4));
		selectByText(ap.getNoOfRoom(), excelRead2(0, 5));
		javaScriptSendKeys(excelRead2(0, 6), ap.getCheckInDate());
		javaScriptSendKeys(excelRead2(0, 7), ap.getCheckOutDate());
		selectByText(ap.getAdultRoom(), excelRead2(0, 8));
		btnClick(ap.getClickSearch());
		btnClick(ap.getRadioBtnClick());
		btnClick(ap.getClickContinue());
		
		AdactinBookingPagePojo bp =new AdactinBookingPagePojo();
		
		sendKey(bp.getFirstName(), excelRead2(0, 9));
		sendKey(bp.getLastName(), excelRead2(0, 10));
		sendKey(bp.getAddress(), excelRead2(0, 11));
		sendKey(bp.getCcNumber(), excelRead2(0, 12));
		
		selectByText(bp.getCcType(),excelRead2(0, 13));
		selectByText(bp.getCcMonth(), excelRead2(0, 14));
		selectByText(bp.getCcYear(), excelRead2(0, 15));
		
		sendKey(bp.getCvv(), excelRead2(0, 16));
		btnClick(bp.getClickBookNow());
		Thread.sleep(6000);
		
		
	}

}
