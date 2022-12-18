package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class ExcelReadSample {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\SampleSheet.xlsx");
		FileInputStream finput =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(finput);
		Sheet s = w.getSheet("Sheet1");
		
		int noOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = s.getRow(i);
		
		int noOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < noOfCells; j++) {
			Cell cell = row.getCell(j);	
	int type = cell.getCellType();
		
	String text ="";
		
		if (type==1) {
		text = cell.getStringCellValue();	
		}	else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			
			SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
			text = sim.format(date);
			
		}else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			text = String.valueOf(l);
		}
		System.out.println(text);
		}
		
		}
		
	}
}
