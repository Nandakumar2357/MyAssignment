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

public class NoOfRowsCells {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\StudentDetails.xlsx");
		FileInputStream finput =new FileInputStream(file);
		Workbook w=new XSSFWorkbook(finput);
		Sheet s=w.getSheet("excel Read");
		int numberOfRows = s.getPhysicalNumberOfRows();
		System.out.println("No of Rows : " + numberOfRows);
		
		for (int i = 0; i <numberOfRows; i++) {
			Row row = s.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
System.out.println(numberOfCells);
		
			
			
			
			
		
			
			

			
		}
		
	}

	}

