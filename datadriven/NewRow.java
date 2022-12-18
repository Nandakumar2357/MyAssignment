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

public class NewRow {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\StudentDetails.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("excel Read");
		Row row12 = s.createRow(0);
		Cell c112 = row12.createCell(0);
		c112.setCellValue("New Row Created");
		Cell c113 = row12.createCell(1);
		c113.setCellValue("New Cell");
		
		FileOutputStream fout =new FileOutputStream(file);
		w.write(fout);
		
		
	}

}
