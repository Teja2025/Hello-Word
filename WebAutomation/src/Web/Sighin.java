package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sighin {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");  //url
		Thread.sleep(3000);
		
		driver.manage().window().maximize();  // maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();            // sign in
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("tejashwini.c@ultraviolette.com");       // email
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		Thread.sleep(20000);
		
	  WebElement we= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));//arrow....configure main page.
	  Thread.sleep(5000);
      Actions a=new Actions(driver);
      a.moveToElement(we).click().build().perform();
	}

}
