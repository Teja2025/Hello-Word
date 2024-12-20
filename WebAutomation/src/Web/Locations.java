package Web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
	  /*  driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='SMART TECH']")).click(); //smarttech
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // logo
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();       //configure
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CAREERS']")).click();          //careers
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();    //book test ride
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();             // sign in   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[1]/div[1]")).click();  // back.....book test ride
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing
		Thread.sleep(3000);*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,7000)");
		driver.findElement(By.xpath("//a[text()='Locations']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jy=(JavascriptExecutor)driver;
		jy.executeScript("window.scrollTo(0,500)");
	WebElement arrows=	driver.findElement(By.xpath("//h1[text()='GET DIRECTIONS']"));
			String spwh=driver.getWindowHandle();              //parent address
	System.out.println(spwh);                          // print parent address
	arrows.click();                                    // click download arrow
	Thread.sleep(3000);
	Set<String> sallwh=driver.getWindowHandles();       // get all address
	for(String swh:sallwh)
	{
		System.out.println(swh);
		if(!spwh.equals(swh)) {
			driver.switchTo().window(spwh);              // switch back to parent address
		}
	}
	Thread.sleep(3000);
  driver.findElement(By.xpath("//h1[text()='BOOK TEST RIDE']")).click();
  Thread.sleep(3000);
  driver.navigate().back();
  Thread.sleep(3000);
  JavascriptExecutor jg=(JavascriptExecutor)driver;
  jg.executeScript("window.scrollTo(0,2600)");
  Thread.sleep(3000);
  
		
		
	}

}
