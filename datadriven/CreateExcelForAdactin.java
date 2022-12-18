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

public class CreateExcelForAdactin {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\AdactinHotelDetails.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sheet = w.createSheet("Hotel Datails");
		Row row = sheet.createRow(0);
		
		Cell c0 = row.createCell(0);
		c0.setCellValue("Vijay12378");
		Cell c1 = row.createCell(1);
		c1.setCellValue("Vijay123");
		Cell c2 = row.createCell(2);
		c2.setCellValue("Melbourne");
		Cell c3 = row.createCell(3);
		c3.setCellValue("Hotel Sunshine");
		Cell c4 = row.createCell(4);
		c4.setCellValue("Deluxe");
		Cell c5 = row.createCell(5);
		c5.setCellValue("1 - One");
		Cell c6 = row.createCell(6);
		c6.setCellValue("03/12/2022");
		Cell c7 = row.createCell(7);
		c7.setCellValue("04/12/2022");
		Cell c8 = row.createCell(8);
		c8.setCellValue("1 - One");
		Cell c9 = row.createCell(9);
		c9.setCellValue("Nandaaaaa");
		Cell c10 = row.createCell(10);
		c10.setCellValue("kumarrr");
		Cell c11 = row.createCell(11);
		c11.setCellValue("chennaiii");
		Cell c12 = row.createCell(12);
		c12.setCellValue("2351 2546 5426 2451");
		Cell c13 = row.createCell(13);
		c13.setCellValue("VISA");
		Cell c14 = row.createCell(14);
		c14.setCellValue("February");
		Cell c15 = row.createCell(15);
		c15.setCellValue("2022");
		Cell c16 = row.createCell(16);
		c16.setCellValue("215");
		
		FileOutputStream fout = new FileOutputStream(file);
		w.write(fout);
		System.out.println("done");
		
	}

}
