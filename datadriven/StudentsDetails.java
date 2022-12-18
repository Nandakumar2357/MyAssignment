package org.datadriven;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;

public class StudentsDetails extends BaseClass {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Ramya\\eclipse-workspace\\MavenProject1\\excel\\StudentDetails.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("excel Read");
		Row row = s.createRow(0);
		Row row1 = s.createRow(1);
		Row row2= s.createRow(2);
		Row row3 = s.createRow(3);
		Row row4 = s.createRow(4);
		Row row5 = s.createRow(5);
		Row row6 = s.createRow(6);
		Row row7 = s.createRow(7);
		Row row8 = s.createRow(8);
		Row row9 = s.createRow(9);
		Row row10 = s.createRow(10);			
		Cell c1 = row.createCell(0);
		c1.setCellValue("Students Name");
		Cell c2 = row.createCell(1);
		c2.setCellValue("Course");
		Cell c3 = row1.createCell(0);
		c3.setCellValue("Nanda");
		Cell c4 = row1.createCell(1);
		c4.setCellValue("Java");
		Cell c5 = row2.createCell(0);
		c5.setCellValue("Tanu");
		Cell c6 = row2.createCell(1);
		c6.setCellValue("Biz");
		Cell c7 = row3.createCell(0);
		c7.setCellValue("Peumal");
		Cell c8 = row3.createCell(1);
		c8.setCellValue("Dev-Ops");
		Cell c9 = row4.createCell(0);
		c9.setCellValue("madhan");
		Cell c10 = row4.createCell(1);
		c10.setCellValue("B.com");
		Cell c11 = row5.createCell(0);
		c11.setCellValue("Deepan");
		Cell c12 = row5.createCell(1);
		c12.setCellValue("Java-2");
		Cell c13 = row6.createCell(0);
		c13.setCellValue("Arul");
		Cell c14 = row6.createCell(1);
		c14.setCellValue("Devops");
		Cell c15 = row7.createCell(0);
		c15.setCellValue("Amudhan");
		Cell c16 = row7.createCell(1);
		c16.setCellValue("Mbbs");
		Cell c17 = row8.createCell(0);
		c17.setCellValue("Lokesh");
		Cell c18 = row8.createCell(1);
		c18.setCellValue("frameWork");
		Cell c19 = row9.createCell(0);
		c19.setCellValue("Radha");
		Cell c20 = row9.createCell(1);
		c20.setCellValue("Api");
		Cell c21 = row10.createCell(0);
		c21.setCellValue("Kumar");
		Cell c22 = row10.createCell(1);
		c22.setCellValue("Selenium");	
		FileOutputStream fout=new FileOutputStream(file);
		w.write(fout);
		
	}

}
