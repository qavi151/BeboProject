package Day2wait;

import org.testng.annotations.Test;

public class GroupingTestDemo {
  @Test(priority=1, groups= {"sanity","regression"})
  public void loginByEmail() {
	  System.out.println("This is login By Email");
  }
  @Test(priority=2, groups= {"sanity"})
  public void loginByFacebook() {
	  System.out.println("This is login By Facebook");
  }
  
}
