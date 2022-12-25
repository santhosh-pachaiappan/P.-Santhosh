package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readdata(String fileName) throws IOException {
		//set the path for workbook
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		//open the sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		//Row count
		int RowNum = sheet.getLastRowNum();
		//column count
		short ColumnNum = sheet.getRow(0).getLastCellNum();
		String [][] data = new String [RowNum][ColumnNum];
		//get row value outer loop
		for(int i =1; i<=RowNum; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			//column count using inner loop
			
			for (int j =0; j<ColumnNum; j++) {
				XSSFCell cell = row.getCell(j);
				
				System.out.println(cell.getStringCellValue());
				data [i-1][j] = cell.getStringCellValue();
			}
	}
		wbook.close();
		return data;
}}
