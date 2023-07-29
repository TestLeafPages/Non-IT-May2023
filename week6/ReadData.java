package week6;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public void main(String[] arg) throws IOException {
		// setup the path
		XSSFWorkbook wb = new XSSFWorkbook("data/CreateLead.xlsx");
		// Get into the sheet
		XSSFSheet ws = wb.getSheet("Sheet1");// wb.getSheetAt(0)
		// To get the row
		int rowCount = ws.getLastRowNum(); 
		for (int i = 0; i <=rowCount; i++) {//0 1 2
			XSSFRow row = ws.getRow(i);	
		// To get the cell(column)	
		short columnCount = row.getLastCellNum();
		
		//to pass the data
		String [][] data=new String[rowCount][columnCount];
		
		for(int j=0;j<columnCount;j++) {
			XSSFCell cell = row.getCell(j);
       //print the particular value
		String value = cell.getStringCellValue();
		
		data[i][j]=cell.getStringCellValue();
		
		System.out.println(value);
		//close the workbook
				wb.close();
		}
		
		}	
			
		
	}

}
