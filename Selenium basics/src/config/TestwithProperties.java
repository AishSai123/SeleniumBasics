package config;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestwithProperties {
	
	WebDriver driver=null;
	public static String Browsername=null;
	static String driverpath=System.getProperty("user.dir");
	
  @Test
  public void test() {
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  
  }
  @BeforeTest
  public void setup() {
	  PropertiesFile.getProperties();
	  
	  if(Browsername.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver",driverpath+"/Drivers/chromedriver.exe");
		  driver=new ChromeDriver();
	  }else if(Browsername.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver",driverpath+"/Drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
  }

  @AfterTest
  public void afterClass() {
	  driver.close();
  }

}
