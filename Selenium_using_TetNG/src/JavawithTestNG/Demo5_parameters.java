package JavawithTestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5_parameters {
 @Test
@Parameters({"browser","URL"})
  
  public void test(@Optional("FireFox")String browser1,String url) {
	  System.out.println("Browser:"+browser1);
	  System.out.println("AUT Link"+url);
  
}
}
