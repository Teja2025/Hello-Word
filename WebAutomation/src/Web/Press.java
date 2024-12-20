package Web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Press {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Press']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='SUBSCRIBE'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='enteredEmailId']")).sendKeys("tejashwini.c@ultraviolette.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='SUBSCRIBE']")).click();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,300)");
		WebElement w1=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[1]"));
		Thread.sleep(3000);
		w1.click();
		Thread.sleep(5000);	

		String pwh=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh=driver.getWindowHandles();
		for(String wh:allwh) {
			System.out.println(wh);
			if(!pwh.equals(wh)) {
				driver.switchTo().window(pwh);
			}
		}
		Thread.sleep(5000);
		WebElement w2=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[2]"));
		Thread.sleep(3000);
		w2.click();
		Thread.sleep(5000);	

		String pwh2=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh2=driver.getWindowHandles();
		for(String wh2:allwh2) {
			System.out.println(wh2);
			if(!pwh2.equals(wh2)) {
				driver.switchTo().window(pwh2);
			}
		}
		Thread.sleep(5000);

		WebElement w3=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[3]"));
		Thread.sleep(3000);
		w3.click();
		Thread.sleep(5000);	
		String pwh3=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh3=driver.getWindowHandles();
		for(String wh3:allwh3) {
			System.out.println(wh3);
			if(!pwh3.equals(wh3)) {
				driver.switchTo().window(pwh3);
			}
		}
		Thread.sleep(5000);

		WebElement w4=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[4]"));
		Thread.sleep(3000);
		w4.click();
		Thread.sleep(5000);	
		String pwh4=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh4=driver.getWindowHandles();
		for(String wh4:allwh4) {
			System.out.println(wh4);
			if(!pwh4.equals(wh4)) {
				driver.switchTo().window(pwh4);
			}
		}
		Thread.sleep(5000);

		WebElement w5=	driver.findElement(By.xpath("(//div[text()='VIEW ARTICLE'])[5]"));
		Thread.sleep(3000);
		w5.click();
		Thread.sleep(5000);	
		String pwh5=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh5=driver.getWindowHandles();
		for(String wh5:allwh5) {
			System.out.println(wh5);
			if(!pwh5.equals(wh5)) {
				driver.switchTo().window(pwh5);
			}
		}
		Thread.sleep(5000);

		JavascriptExecutor js6=(JavascriptExecutor)driver;
		js6.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);

		WebElement  w= driver.findElement(By.xpath("//div[text()='SUBSCRIBE TO OUR YOUTUBE']"));
		Actions a=new Actions(driver);
		a.moveToElement(w).click().perform();
		Thread.sleep(5000);	

		String pwh6=driver.getWindowHandle();
		System.out.println();
		Set<String> allwh6=driver.getWindowHandles();
		for(String wh6:allwh6) {
			System.out.println(wh6);
			if(!pwh6.equals(wh6)) {
				driver.switchTo().window(pwh6);
			}
		}
		Thread.sleep(5000);	

		JavascriptExecutor js7=(JavascriptExecutor)driver;
		js7.executeScript("window.scrollTo(500,1800)");
		Thread.sleep(3000);


	}}
