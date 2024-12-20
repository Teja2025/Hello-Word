package  Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uvracing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();  // maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();     // UV RACING
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='F77']")).click();           //f77
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SMART TECH']")).click();    //  SMART TECH
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // LOGO
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();      //configure
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CAREERS']")).click();        //careers
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();  //book test ride
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();            // sign in
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[1]/div[1]")).click();   // back.....book test ride
		Thread.sleep(3000);
		WebElement w1= driver.findElement(By.xpath("//div[text()='UV RACING']"));      // UV RACING
		Actions a=new Actions(driver);
		a.moveToElement(w1).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor a1=(JavascriptExecutor)driver;
		a1.executeScript("window.scrollTo(0,3900)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='I am Interested']")).click(); // register your interest
		Thread.sleep(3000);
		driver.navigate().back(); // UV RACING
		Thread.sleep(3000);
		JavascriptExecutor aa1=(JavascriptExecutor)driver;
		aa1.executeScript("window.scrollTo(0,6000)"); //end
		Thread.sleep(3000);
	}
}
