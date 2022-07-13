package JavawithTestNG;

import org.testng.annotations.Test;

public class Demo2_dependsOnMethod {
  @Test
  public void login() {
	  System.out.println("inside login");
  }
  @Test(dependsOnMethods= {"login"})
  public void dashboarrd() {
	  System.out.println("inside dashboard");
  }
  @Test(dependsOnMethods= {"dashboarrd"})
  public void logout() {
	  System.out.println("inside logout");
}
}
