package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setupaplication() {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeaplication() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	
	}
		
	}


