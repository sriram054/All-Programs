package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	static Workbook book;
	static Sheet sheet;
	static String test_sheet_path="C:\\Users\\Sainadha\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCRMTestData.xlsx";
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	public static Object[][] getTestData(String SheetName)
	{
		FileInputStream file=null;
		try
		{
			file=new FileInputStream(test_sheet_path);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book=WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet=book.getSheet(SheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i =0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(k).getLastCellNum();k++)
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		}
		return data;
		
	}
	
}
