import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:\\Selenium\\ExcellFile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//XSSFRow row=sheet.getLastRowNum();
		
		row.getCell(2).getCellFormula();
		
		XSSFCell cell=row.getCell(0);
		HSSFDateUtil.isCellDateFormatted(cell);
		cell.getDateCellValue();
		
		//Use Git from Git Bash only
		//Copy the location of project
		//Go to folder of project
		//Right Click and Git Bash here
		//git init
		//Go to Github.com
		
		
		//SSH-keygen -t rsa
		
		
		
		
		

	}

}
