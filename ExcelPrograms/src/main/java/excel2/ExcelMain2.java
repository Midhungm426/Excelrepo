package excel2;

import java.io.IOException;

public class ExcelMain2 
{
	public static void main (String args[]) throws IOException
	{
		String s1= ExcelCode2.readStringData(6, 4);
		System.out.println(s1);
		
		String s2= ExcelCode2.readIntegerData(10, 7);
		System.out.println(s2);
	}
}