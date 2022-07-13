package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium basics\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		driver.manage().window().maximize();
		
//locating element using normal xpath - //tag[condition1]
		driver.findElement(By.xpath("//p[@id='id1']"));
		System.out.println("Unique id field located by normal xpath");
		driver.findElement(By.xpath("//p[@name='name1']"));
		System.out.println("Unique name field is located by normal xpath");
		driver.findElement(By.xpath("//p[@value='value1']"));
		
		System.out.println("Unique value field is located by normal xpath");
		
		
		
 //locating elements using unique combination of attributes - //tag[condition1 or condition2] or //tag[condition1 and condition2] or //	tag[(condition1 or condition2)and condition2]
		driver.findElement(By.xpath("//p[@name='a' and @id='a' ]"));
		driver.findElement(By.xpath("//p[@name='a' or  @id='a' ]"));
		driver.findElement(By.xpath("//p[(@name='a' or @id='a')and @id='b']"));
		
		System.out.println("Elements are located by unique combination of attributes");
		
		
//locating an element when the child is unique - //tag[condition1]/..
		driver.findElement(By.xpath("//span[@id='link']/.."));
		System.out.println("located anchor tag from its unique child span");
		
//locating an element when the parent is unique - //tag[condition1]/tag[condition2]
		driver.findElement(By.xpath("//div[@id='divA']/input[@type='text']"));
		System.out.println("//tag[condition1]/tag[condition2] successed");
		
		driver.findElement(By.xpath("//div[@id='divC']/span/input"));
		System.out.println("//tag[condition1]/tag/tag successed");
		
		driver.findElement(By.xpath("//div[@id='divC']//input"));
		System.out.println("//tag[condition1]//tag successed");
		
//locating an element using index when nothing is unique - (//tag[condition])[index num]
		driver.findElement(By.xpath("(//label[@id='lable'])[1]"));
		System.out.println("Element located using index number");
		
		
//Identification of an element by using another element which has an attribute
		driver.findElement(By.xpath("//a[.//span[@id='link']]"));
		System.out.println("Element is identified through another element which has an attribute");
		
		
		
//location elements using functions - text()/contains()/starts-with()/
		driver.findElement(By.xpath("//p[text()='unique id']"));
		System.out.println("element located by text() function");
		
		driver.findElement(By.xpath("//p[contains(@id, 'd1')]"));
		driver.findElement(By.xpath("//p[contains(@id,'random')]"));
		System.out.println("Element located by contains() function");
		Thread.sleep(5000);
		
		/*
		 * driver.findElement(By.
		 * xpath("//p[starts-with(text(),'logged in successfully :')]"));
		 * System.out.println("Element located by starts-with function");
		 * 
		 * starts-with function is not working with text() method
		 */
		
//navigating to another URL to illustrate positions/count/
		driver.get("https://theautomationzone.blogspot.com/2020/07/sample-webtable-3.html");
		Thread.sleep(5000);
		System.out.println("driver navigated to the 2nd url");
		
//locating table and traversing using position/last/count functions
		driver.findElement(By.xpath("//table[@id='table1']"));
		System.out.println("table identified");
		driver.findElement(By.xpath("//table[@id='table1']//tr[position()=1]"));
		System.out.println("row identified using position function");
		driver.findElement(By.xpath("//table[@id='table1']//tr[last()]"));
		driver.findElement(By.xpath("//table[@id='table1']//tr[last()]/td/input"));
		//locating the row using index number
		driver.findElement(By.xpath("//table[@id='table1']//tr[1]"));
		System.out.println("rows identified using last function");
		
//locating table having 8 rows using  count function
		driver.findElement(By.xpath("//table[count(.//tr)=8]"));//always insert dot(.//) to decrement the area of search in html page.
		System.out.println("table with 8 rows is identified using count function"); 
		
//locating an element by ignoring Case and Spaces in text , by using normalize-space/translate,not,floor,round,string-length,substring
		
//normalize-space() helps the user to identify the webelements based on inner text by removing the space before and after html tag
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		System.out.println("navigated to the first url again");
		
		//normalize-space
		driver.findElement(By.xpath("//p[normalize-space(@id)='randomText']"));
		System.out.println("Tommy text is located by ignoring preceeding,trailing and both preceedind and trailing spaces using normalize-space function");
		/* normalize-space() is not working with text() function */
		
		
		//translate or replace function : syntax - "translate(string in which u want to translate,str1,str2)"
		/*
		 * driver.findElement(By.xpath(
		 * "//p[normalize-space(translate(text(),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'))='tommy']"
		 * )); System.out.
		 * println("locating an element by ignoring case of that element by using translate function"
		 * );
		 */
		/* translate function is not working for both text() and attribute*/
		
		
		//string-length
		driver.findElement(By.xpath("//p[string-length(text())>30 and (@id='a' and @name='a')]"));
		System.out.println("string-length is implemented");
		
		//round - syntax : //tagName[round(text())='54']
		//floor - syntax : //tagName[floor(text())='53']
		
		
		//not
		driver.findElement(By.xpath("//input[@name='gender' and not(@id='gender-0')]"));
		System.out.println("Female radio button is located by using 'not' function");
		
		/*
		 * substring-after and substring-before p[substring-after(text(), ':') = '8am']
		 * is not working
		 */
		
		driver.close();
		 
	
	}
}