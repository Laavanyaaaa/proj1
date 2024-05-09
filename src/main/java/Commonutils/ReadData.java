package Commonutils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public static String getLocatore(String filename, String key) throws Exception
	{
	String filepath = ".\\src\\main\\resources\\Locators\\"+filename+".properties";
	FileInputStream instream = new FileInputStream(filepath);

	Properties pro = new Properties();

	pro.load(instream);
	return pro.getProperty(key);
	}
	public static String getEcellData(String filename,int row ,int cell,String sheetname) throws Exception
	{
	String filepath = ".\\src\\main\\resources\\TestData\\"+filename+".xlsx";
	FileInputStream instream = new FileInputStream(filepath);
	XSSFWorkbook book = new XSSFWorkbook(instream);
	XSSFSheet sheet = book.getSheet(sheetname);
	return sheet.getRow(row).getCell(cell).getStringCellValue();
	}

	public static List<String> getEcellData(String filename,String sheetname,int row) throws Exception
	{
	String filepath = ".\\src\\main\\resources\\TestData\\"+filename+".xlsx";
	FileInputStream instream = new FileInputStream(filepath);
	XSSFWorkbook book = new XSSFWorkbook(instream);
	XSSFSheet sheet = book.getSheet(sheetname);
	int rowdata = sheet.getRow(row).getLastCellNum();
	List<String> info = new ArrayList<String>();

	for(int i=0;i<rowdata;i++)
	{
	String data = sheet.getRow(row).getCell(i).getStringCellValue();
	System.out.println(data);
	info.add(data);

	}
	return info;

	}

	public static String[][] getEcellData(String filename,String sheetname) throws Exception
	{
	String filepath = ".\\src\\main\\resources\\TestData\\"+filename+".xlsx";
	FileInputStream instream = new FileInputStream(filepath);
	XSSFWorkbook book = new XSSFWorkbook(instream);
	XSSFSheet sheet = book.getSheet(sheetname);
	int row = sheet.getLastRowNum();
	int cell = sheet.getRow(0).getLastCellNum();

	String completedata[][] = new String[row][cell];
	int k=0,l;
	for(int i=1;i<=row;i++)
	{
	l=0;
	for(int j=0;j<cell;j++)
	{
	completedata[k][l++] = sheet.getRow(i).getCell(j).getStringCellValue();
	// System.out.println(completedata[k][l]);

	}
	k++;
	}
	return completedata;




	}





	public static void main(String[] args) throws Exception
	{
	String data = ReadData.getLocatore("loginpage", "usernameL");
	System.out.println(data);

	String sheet = ReadData.getEcellData("Browser", 1, 1, "sheet1");
	System.out.println(sheet);

	List<String> info = ReadData.getEcellData("loginpage", "sheet1", 2);
	System.out.println(info);

	String[][] completedata = ReadData.getEcellData("loginpage", "sheet1");
	for(int i=0;i<completedata.length;i++)
	{
	for(int j=0;j<completedata[i].length;j++)
	{
	System.out.print(completedata[i][j]+"  ");
	}
	System.out.println();
	}


	}
}
