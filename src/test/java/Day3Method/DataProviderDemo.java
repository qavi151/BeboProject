package Day3Method;

import org.openqa.selenium.WebDriver;

public class DataProviderDemo  {
WebDriver driver;

@BeforeClass
void setup()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
}

@Test(dataProvider="dp")
void testLogin(String email, String pwd)
{
driver.get("https://demo.nopcommerce.com/login");
driver.manage().window().maximize();
driver.findElement(By.id("Email")).sendKeys(email);
driver.findElement(By.id("Password")).sendKeys(pwd);
driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

String exp_title = "nopCommerce demo store";
String act_title = driver.getTitle();

Assert.assertEquals(exp_title, act_title);
}

@AfterClass
void tearDown()
{
driver.close();
}

@DataProvider(name="dp" ,indices= {0,1,4})
String [][] loginData()
{
String data[][]= {
{ "abc11@gmail.com", "test123" },
{ "pavanol@gmail.com", "test@123" },
{ "pavanoltraining@gmail.com", "test3" },
{ "pavanoltraining@gmail.com", "test@123" },
{ "pavanoltraining@gmail.com", "test@123" }
};

return data;
}



}