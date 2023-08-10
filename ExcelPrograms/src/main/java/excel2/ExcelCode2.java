package excel2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode2 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String readStringData(int row, int column) throws IOException
	{
		f= new FileInputStream("C:\\Users\\MIDHUN GM\\OneDrive\\Desktop\\Excel Read.xlsx");
		w= new XSSFWorkbook (f);
		sh=w.getSheet("Sheet2");
		XSSFRow r= sh.getRow(row);
		XSSFCell c= r.getCell(column);
		return c.getStringCellValue();
	}
	public static String readIntegerData(int row, int column) throws IOException
	{
		f= new FileInputStream("C:\\Users\\MIDHUN GM\\OneDrive\\Desktop\\Excel Read.xlsx");
		w= new XSSFWorkbook (f);
		sh=w.getSheet("Sheet2");
		XSSFRow r=sh.getRow(row);
		XSSFCell c= r.getCell(column);
		int a= (int) c.getNumericCellValue();
		return String.valueOf(a);
	}
}
