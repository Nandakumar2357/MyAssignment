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

public class ExcelWriteOperation {

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\\\Users\\\\Ramya\\\\eclipse-workspace\\\\MavenProject1\\\\excel\\\\TestSheet.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet sheet = w.createSheet("DataSheet");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Nandakumar");
		FileOutputStream fout =new FileOutputStream(file);
		w.write(fout);
		System.out.println("done");
}

}
