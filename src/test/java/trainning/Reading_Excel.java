package trainning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel {
	
	
	// File/ WorkBook/ Sheet/  Rows/ Cells

	public static void main(String[] args) throws IOException 
	{

		/*
		FileInputStream file= new FileInputStream("./testData/Testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		int totalRows= sheet.getLastRowNum();                          //----- ------ ----- ----> To fetch total number of Rows
		System.out.println("Total Number of Rows: "+totalRows);
		
		int totaColumns= sheet.getRow(1).getLastCellNum()  ;           //----- ------ ----- ----> To fetch total number of Column
		System.out.println("Total Number of Column: "+totaColumns);
		
		
		
		// ********************Fetching all the data from the Excel Sheet ***********************************
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0; c<totaColumns; c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(": "+cell.toString());
			}
			System.out.println();
			
			
			
			
			
		}
		
		*/
		
	 
		
		
		
		
		
	}

}
