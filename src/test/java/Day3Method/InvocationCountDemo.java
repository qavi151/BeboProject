package Day3Method;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  @Test(invocationCount=10)
  public void test() {
	  System.out.println("Testing...");
  }
}
