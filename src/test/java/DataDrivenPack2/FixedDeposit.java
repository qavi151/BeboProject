package DataDrivenPack2;
import DataDrivenPack.Xutil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FixedDeposit {
	public static void main(String Args[]) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		String file = System.getProperty(("user.dir")+"//TestData//CIT Bank.xlsx");
		int rows = Xutil.getRowCount(file, "Sheet1");
		
		for(int i=1; i<=rows; i++) {
			String deposit = Xutil.getCellData(file, "Sheet1", i, 0);
			
		}
	}
}
