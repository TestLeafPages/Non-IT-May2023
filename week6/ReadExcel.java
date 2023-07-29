package week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String sheets) throws IOException {
		       // setup the path
				XSSFWorkbook wb = new XSSFWorkbook("data/Lead.xlsx");//one Excelbook with multiple sheet
				//XSSFWorkbook wb = new XSSFWorkbook("data/"+fileName+".xlsx");//multiple work book
				// Get into the sheet
				XSSFSheet ws = wb.getSheet(sheets);// wb.getSheetAt(0)
				//Get row Count
				int rowCount = ws.getLastRowNum(); 
				// To get the cell(column)	
				short columnCount = ws.getRow(0).getLastCellNum();
				//to pass the data [][]
				String [][] data=new String[rowCount][columnCount];
				
				for (int i = 1; i <=rowCount; i++) {//0 1 2
					XSSFRow row = ws.getRow(i);	
					
					for(int j=0;j<columnCount;j++) {
						XSSFCell cell = row.getCell(j);
						
						//print the particular value
						String value = cell.getStringCellValue();
						//assign the [row] [column]
						data[i-1][j]=cell.getStringCellValue();
						//0  0  //0 1  //0 2  //0 3
						System.out.println(value);
					}
				}
				
						//close the workbook
								wb.close();
								return data;
	}
}
