package Day3Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;


public class FlipkartTest {
	
	WebDriver driver;
  @Test
  @Parameters("browserOpen")
  public void openBrowser(String para) {
	  switch(para) {
	  case "chrome":
		  driver = new ChromeDriver();
		  break;
	  case "edge":
		  driver = new EdgeDriver();
		  break;
	  case "firefox":
		  driver = new FirefoxDriver();
		  break;
	  }
	  driver.get("https://www.flipkart.com/");
  }
  void closebrowser() throws Exception {
	  Thread.sleep(5000);
	  driver.close();
  }
}
