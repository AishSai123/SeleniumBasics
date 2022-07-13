package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium basics\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.quit();
		

	}

}
