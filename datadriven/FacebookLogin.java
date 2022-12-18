package org.datadriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPagePojo;

public class FacebookLogin extends BaseClass{

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\FacebookLogin.xlsx");
		Workbook w=new XSSFWorkbook();
		
		Sheet sheet = w.createSheet("Facebook details");
		Row row = sheet.createRow(0);
		Cell c0 = row.createCell(0);
		c0.setCellValue("nanda");
		Cell c1 = row.createCell(1);
		c1.setCellValue("abcd@123");
		Cell c2 = row.createCell(2);
		c2.setCellValue("C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\MavenProject1\\\\excel\\\\FacebookLogin.xlsx");
		Cell c3 = row.createCell(3);
		c3.setCellValue("Facebook details");
		
		FileOutputStream fout =new FileOutputStream(file);
		w.write(fout);
		launchBrowser();
		maximize();
		launchWebsite("https://wwww.facebook.com/");
		
		LoginPagePojo l=new LoginPagePojo();
		sendKey(l.getTxtUsername(), excelRead("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\FacebookLogin.xlsx","Facebook details", 0, 0));
		sendKey(l.getTxtPassword(), excelRead("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\FacebookLogin.xlsx", "Facebook details", 0, 1));
		btnClick(l.getBtnClick());
		
		WebElement textErrorMsg = driver.findElement(By.xpath("//div[contains(text(),\"The password that you've entered is incorrect\")]"));
		Assert.assertTrue(textErrorMsg.isDisplayed());
		System.out.println(textErrorMsg.isDisplayed());
	}

}
