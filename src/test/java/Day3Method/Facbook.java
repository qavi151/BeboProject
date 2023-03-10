package Day3Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facbook {
	WebDriver driver; 
  @Test(priority=1)
  public void openChrome() {
	  driver = new ChromeDriver();
	  driver.get("https://www.fb.com/");
  }
  @Test(priority=2)
  void verifyfb() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
	  boolean status = driver.findElement(By.linkText("Create new account")).isDisplayed();   
//	  boolean status = driver.getPageSource().contains("Create an account");
	  Assert.assertEquals(status, true, "Create an account is not Displayed");
  }
  @Test(priority=3)
  void fillpage() {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.name("firstname")).sendKeys("Hamza");
	  driver.findElement(By.name("lastname")).sendKeys("Qavi");
	  driver.findElement(By.name("reg_email__")).sendKeys("abdullahqavi32@gmail.com");
	  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abdullahqavi32@gmail.com");
	  driver.findElement(By.name("reg_passwd__")).sendKeys("4321@gmaiL");
	  Select dobD = new Select(driver.findElement(By.name("birthday_day")));
	  dobD.selectByIndex(2);
	  Select dobM = new Select(driver.findElement(By.name("birthday_month")));
	  dobM.selectByIndex(2);
	  Select dobY = new Select(driver.findElement(By.name("birthday_year")));
	  dobY.selectByIndex(25);
	  driver.findElement(By.xpath("//*[@type='radio' and @value='2']")).click();
	  driver.findElement(By.name("websubmit")).click();
  }
  @Test(priority=4)
  void closefb() throws Exception {
	  Thread.sleep(5000);
	  driver.close();
  }
}
