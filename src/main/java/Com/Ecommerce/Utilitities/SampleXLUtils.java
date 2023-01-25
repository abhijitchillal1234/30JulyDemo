package Com.Ecommerce.Utilitities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleXLUtils {
	
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet Xs;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String XSheet , String Sheet) throws IOException {
		
		fi = new FileInputStream(XSheet);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(Sheet);
		int rowcount = Xs.getLastRowNum();
		
		return rowcount;
		
	}
	
	public static int getCellCount(String XSheet , String Sheet , int rownum) throws IOException {
		
		fi = new FileInputStream(XSheet);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(Sheet);
		XSSFRow row = Xs.getRow(rownum);
		int cellcount = row.getLastCellNum();
		
		return cellcount;
	}
	
	public static String fetchdata(String XSheet , String Sheet , int rownum , int cellnum) throws IOException {
		
		fi = new FileInputStream(XSheet);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(Sheet);
	   row = Xs.getRow(rownum);
	  cell = row.getCell(cellnum);
	  
	  String data;
	  
	  try {
	  DataFormatter formatter = new DataFormatter();
	  String celldata = formatter.formatCellValue(cell);
	  
	  return celldata;
	  }catch(Exception e) {
		  
		  data="";
	  }
	  return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
