package org.demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {

		String file = "E:\\Sample.xlsx";
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Cricketers");
		
		int rr = sh.getLastRowNum();
		int cc = sh.getRow(0).getLastCellNum();
		
		for(int r=0;r<rr;r++)
		{
			for(int c=0;c<cc;c++)
			{
				
				System.out.println(sh.getRow(r).getCell(c).toString());				
			}
			
			wb.close();
		}
		
	}

}
