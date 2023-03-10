package Day2wait;

import org.testng.annotations.*;

import org.testng.annotations.Test;

public class SearchAndAdvanceSearch {
  @BeforeClass
  public void login() {
	  System.out.println("Login...");
  }
  @Test(priority=1)
  public void search() {
	  System.out.println("Search...");
  }
  @Test(priority=2)
  public void AdvanceSearch() {
	  System.out.println("Login...");
  }
  @AfterMethod
  public void logout() {
	  System.out.println("Logout...");
  }
}
