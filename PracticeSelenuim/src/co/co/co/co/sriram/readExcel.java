package co.co.co.co.sriram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public readExcel(String path) throws FileNotFoundException
	{
		try {
			File src=new File(path);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	public String getData(int sheetnumber,int row, int column)
	{
		sheet=wb.getSheetAt(sheetnumber);
		String Data=sheet.getRow(row).getCell(column).getStringCellValue();
		return Data;
	}
	public int getRowCount(int sheetindex)
	{
		int rows=wb.getSheetAt(sheetindex).getLastRowNum();
		rows=rows+1;
		return rows;
	}

}
