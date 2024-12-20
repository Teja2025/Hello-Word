package Web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
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
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		WebElement w= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/a/div/img"));
		Thread.sleep(3000);
		w.click();
		Thread.sleep(5000);
		String pwh=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh) {
			System.out.println(wh);
			if(!pwh.equals(wh)){
				driver.switchTo().window(pwh);

				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollTo(500,1000)");
				Thread.sleep(3000);

			}
		}




	}}
