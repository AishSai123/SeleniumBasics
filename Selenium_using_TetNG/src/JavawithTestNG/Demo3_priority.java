package JavawithTestNG;

import org.testng.annotations.Test;

public class Demo3_priority {
  @Test(priority=0,enabled=false)
  public void Test1() {
	  System.out.println("Inside1");
  }
  @Test(priority=1)
  public void Test2() {
	  System.out.println("Inside2");
  }
  @Test(priority=2)
  public void Test3() {
	  System.out.println("Inside3");
  }
}
