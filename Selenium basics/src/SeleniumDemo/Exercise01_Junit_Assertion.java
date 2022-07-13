package SeleniumDemo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

class Exercise01_Junit_Assertion {
	
	WebDriver driver;
	@BeforeEach
	void setUp() throws Exception {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		Thread.sleep(3000);
		
	}

   @AfterEach
   void tearDown() throws Exception {
	   //driver.close();
		
	}

	@Test
	void test() throws IOException {
//		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcfile,new File("C:\\Users\\DELL\\Desktop\\Image.jpg"));
		String filepath=System.getProperty("C:\\Users\\DELL\\Desktop")+"\\Cred.xlsx";
		System.out.println(filepath);
//		FileInputStream fis=new FileInputStream(filepath);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sh=wb.getSheet("UserDetails");
//		int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
//		System.out.println("number of rows:"+rowcount);
//		int colcount=sh.getRow(1).getLastCellNum();
//		System.out.println("number of columns:"+colcount);	
//		int i;
//		for(i=1;i<=rowcount;i++) {
//			
//			XSSFCell cell=sh.getRow(i).getCell(1);
//			String cellText=cell.getStringCellValue();
//			System.out.println(cellText);
//				
			}
			
			
			
		}
		
		
		
		
	


