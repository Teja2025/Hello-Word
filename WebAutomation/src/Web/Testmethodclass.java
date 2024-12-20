package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testmethodclass  {
	
@Test
public void testlogin() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Loginpageorangehrm l=new Loginpageorangehrm(driver);
Thread.sleep(4000);
l.setlogin("Admin","admin123");

}
		}


