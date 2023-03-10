package Day2wait;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest12 {
  @Test
  public void HardAssertion() {
	  System.out.println("Testing ....");
	  System.out.println("Testing ....");
	  Assert.assertEquals(1, 2);
	  System.out.println("Testing ....");
  }
  @Test
  public void SoftAssert() {
	  System.out.println("Testing ....");
	  System.out.println("Testing ....");
	  org.testng.asserts.SoftAssert  sa = new org.testng.asserts.SoftAssert();
	  sa.assertEquals(1, 2);
	  System.out.println("Testing ....");
  }
}
