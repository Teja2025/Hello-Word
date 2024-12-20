package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enquiry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(1000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(1000);
	 /* driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
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
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,7000)");
		driver.findElement(By.xpath("//a[text()='Enquiry']")).click();
		Thread.sleep(3000);
	/*	driver.findElement(By.xpath("//*[@id=\"dropdown_inputField\"]/div/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='DEALERSHIP / DISTRIBUTORSHIP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='NEXT']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//*[@id=\"dropdown_inputField\"]/div/div[1]/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='F77'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id=\"dropdown_inputField\"]/div/div[1]/div[2])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='On road price']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='enteredFullName']")).sendKeys("rose");
		Thread.sleep(3000);
	    WebElement w1= driver.findElement(By.xpath("//div[text()='COUNTRY']"));
     	Actions a=new Actions(driver);
     	a.moveToElement(w1).click().sendKeys("INDIA").build().perform();
     	Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='INDIA']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[text()='AFGHANISTAN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id=\"dropdown_inputField\"]/div/div[1]/div[2])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Badakhshan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='enteredPincode']")).sendKeys("5674");
		
		Thread.sleep(3000);
		
		
		
		
	}

}
