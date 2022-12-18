package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdateOperation {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\\\\\\\Users\\\\\\\\Ramya\\\\\\\\eclipse-workspace\\\\\\\\MavenProject1\\\\\\\\excel\\\\\\\\TestSheet.xlsx");
		FileInputStream finput =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(finput);
		Sheet sheet = w.getSheet("DataSheet");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String text = cell.getStringCellValue();
		if (text.equals("Nandakumar")) {
			cell.setCellValue("kumar");
		}
		FileOutputStream fout =new FileOutputStream(file);
		w.write(fout);
		System.out.println("Done");
	}

}
