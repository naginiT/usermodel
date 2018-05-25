package Utilities;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

		public static XSSFWorkbook workbook;
		public static XSSFSheet Sheet;
		public static XSSFCell cell;
	static String a;
	static String i;
	public static void Code(String sheet, String path) throws Exception{
		

	FileInputStream fis=new FileInputStream(path);
	 workbook= new XSSFWorkbook(fis);
	 Sheet= workbook.getSheet(sheet);

	}
	public static String  RowColumn1(int row, int column) throws Exception
	
	{
		
           
		cell=Sheet.getRow(row).getCell(column);
		
		if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
			long k=(long)cell.getNumericCellValue();
			a=String.valueOf(k);
			System.out.println(a);
			Thread.sleep(3000);
			
		}else{
			a=cell.getStringCellValue();

		}
		return a;
	
		
		

	
	}
}



