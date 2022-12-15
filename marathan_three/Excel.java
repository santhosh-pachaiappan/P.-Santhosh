package marathan_three;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static String[][] readdata(String fileName) throws IOException {
		
		XSSFWorkbook workBook= new XSSFWorkbook("data/"+fileName+".xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastRowNum][lastCellNum];
		
		//to get row value
		
		for (int i =1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
		
		for (int j=0; j<lastCellNum; j++) {
			XSSFCell cell = row.getCell(j);
			
			System.out.println(cell.getStringCellValue());
			data[i-1][j] = cell.getStringCellValue();
		}}
		workBook.close();
		return data;
	}}

