package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo2 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bankofbaroda.in/");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=\"bdMainSite\"]")).click();
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"bdMainSite\"]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"bdMainSite\"]"));
    	Actions action=new Actions(driver);
		action.moveToElement(a).perform();
		action.moveToElement(b).build().perform();
		
//		driver.close();
		
		

	}

}
