package Com.Ecommerce.Utilitities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet Xs;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String Xfile , String XSheet) throws IOException {
		
		fi = new FileInputStream(Xfile);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(XSheet);
		int rowcount = Xs.getLastRowNum();
		
		return rowcount;
	}
	
	public static int getCellCount(String Xfile , String XSheet , int rownum) throws IOException {
		
		fi = new FileInputStream(Xfile);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(XSheet);
		row = Xs.getRow(rownum);
		int cellcount = row.getLastCellNum();
		
		return cellcount;
	}
	
	public static String getCellData(String Xfile , String XSheet , int rownum , int colnum) throws IOException {
		
		fi = new FileInputStream(Xfile);
		wb = new XSSFWorkbook(fi);
		Xs = wb.getSheet(XSheet);
		row = Xs.getRow(rownum);
		cell = row.getCell(colnum);
		
		String data;
		
		try {
		DataFormatter formatter = new DataFormatter();
		String celldata = formatter.formatCellValue(cell);
		
		return celldata;
		}
		catch(Exception e) {
			
			data = "";
		}
		
		return data;
		
		
	}
	
	
	
}
	
	
	
	
	


