package Utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		//step1: setup the path of the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//step2: get into the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
DataFormatter obj=new DataFormatter();		
		int rowCount = ws.getLastRowNum();
		int cellCount = ws.getRow(0).getLastCellNum();
		
		//declare the String[][]
		String[][] data = new String[rowCount][cellCount];
				
		//to navigate with rows
		for (int i = 1; i <= rowCount; i++) {
			//columns
			for(int j = 0; j < cellCount; j++) { //4
				
				String text;
				
				 Cell celval=ws.getRow(i).getCell(j); text=obj.formatCellValue(celval);
				 //		text= ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				//0,0
				data[i-1][j] =text;
				System.out.println(data[i-1][j]);
			}
			
		}
			
		//final step
		wb.close();
		
		return data;
		
		/*
		 * //step3: get into the row XSSFRow row = ws.getRow(i);
		 * 
		 * //step4: get into the cell XSSFCell cell = row.getCell(0);
		 * 
		 * //step5: to read the data String text = cell.getStringCellValue();
		 */
		
		

	}

}