package excel;

import java.io.IOException;

public class ExcelMain
{
	public static void main(String[] args) throws IOException 
	{
		String s1 = Excelcode.readIntegerData(0,0);
		System.out.println(s1);
		
		String s2 = Excelcode.readStringData(1, 0);
		System.out.println(s2);
	}
}