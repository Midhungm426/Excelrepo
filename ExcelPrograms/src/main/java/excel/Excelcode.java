package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String readStringData(int i, int j) throws IOException     // i= row ,  j= column
	{
		f= new FileInputStream("C:\\Users\\MIDHUN GM\\OneDrive\\Desktop\\Excel Read.xlsx");
		w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(i);
		XSSFCell c= r.getCell(j);
		return c.getStringCellValue();
	}
	public static String readIntegerData (int i, int j) throws IOException
	{
		f= new FileInputStream("C:\\Users\\MIDHUN GM\\OneDrive\\Desktop\\Excel Read.xlsx");
		w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet1");
		XSSFRow r= sh.getRow(i);
		XSSFCell c= r.getCell(j);
		int a= (int) c.getNumericCellValue();
		System.out.println("Hi");
		return String.valueOf(a);
		
		
	}
}
