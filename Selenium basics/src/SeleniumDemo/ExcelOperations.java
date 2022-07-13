package SeleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class ExcelOperations {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		//Reading from excel
		File src=new File("C:\\Users\\DELL\\Desktop\\Cred.xlsx");
		System.out.println(src);
		FileInputStream fis=new FileInputStream(src); 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("UserDetails");
		String data1=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		//writing from excel
		sh.getRow(0).createCell(2).setCellValue("pass");
		sh.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
			
	}	
}
