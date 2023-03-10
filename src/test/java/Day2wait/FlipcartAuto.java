package Day2wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipcartAuto {
	WebDriver driver = new ChromeDriver();
	String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
	String expectedURL ="https://www.flipkart.com/";

  @Test(priority=1)
  public void maxm() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void PageSource() {
	  String actualTitle = driver.getTitle();
	  System.out.println("Title of Flipcart is --> "+actualTitle);
	  String actualURL = driver.getCurrentUrl();
	  System.out.println("Url of Current Page is ==>> "+actualURL);
	  System.out.println(driver.getPageSource());
	  if(expectedTitle.equals(actualURL)){
		  System.out.println("Title  passed");
	  }else {
		  System.out.println("Title  Not Matched with Expected");
	  }
	  if(expectedURL.equals(actualURL)) {
		  System.out.println("URL  passed");
	  }else {
		  System.out.println("URl Not Matched with Expected");
	  }
	  if(driver.getPageSource().contains(expectedTitle)) {
		  System.out.println("Page title present in Page Source");
	  }else {
		  System.out.println("Page title Not present in Page Source");
	  }
  }
  @Test(priority=3)
  public void closeCart() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.close();
  }
}
