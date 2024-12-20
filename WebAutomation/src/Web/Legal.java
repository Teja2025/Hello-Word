package Web;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Legal {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Legal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='PRIVACY POLICY']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[1]/div/div[2]/img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement arrows = driver.findElement(By.xpath("//div[text()='TERMS OF USE']"));  // down load arrow
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
		
		WebElement arrow2= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[2]/div/div[2]/img"));  // down load arrow
		String spwh2=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow2.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh2=driver.getWindowHandles();       // get all address
		for(String swh2:sallwh2)
		{
			System.out.println(swh2);
			if(!spwh2.equals(swh2)) {
				driver.switchTo().window(spwh2);              // switch back to parent address
			}
		}
		Thread.sleep(3000);
		
		WebElement arrow3 = driver.findElement(By.xpath("//div[text()='SALE TERMS AND CONDITIONS']"));  // down load arrow
		String spwh3=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow3.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh3=driver.getWindowHandles();       // get all address
		for(String swh3:sallwh3)
		{
			System.out.println(swh3);
			if(!spwh3.equals(swh3)) {
				driver.switchTo().window(spwh3);              // switch back to parent address
			}
		}
		Thread.sleep(3000);
		
		WebElement arrow4 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[3]/div/div[2]/img"));  // down load arrow
		String spwh4=driver.getWindowHandle();              //parent address
		System.out.println(spwh4);                          // print parent address
		arrow4.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh4=driver.getWindowHandles();       // get all address
		for(String swh4:sallwh4)
		{
			System.out.println(swh4);
			if(!spwh4.equals(swh4)) {
				driver.switchTo().window(spwh4);              // switch back to parent address
			}
		}
		Thread.sleep(3000);
		
		WebElement arrow5= driver.findElement(By.xpath("//div[text()='BOOKING AGREEMENT']"));  // down load arrow
		String spwh5=driver.getWindowHandle();              //parent address
		System.out.println(spwh5);                          // print parent address
		arrow5.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh5=driver.getWindowHandles();       // get all address
		for(String swh5:sallwh5)
		{
			System.out.println(swh5);
			if(!spwh5.equals(swh5)) {
				driver.switchTo().window(spwh5);              // switch back to parent address
			}
		}
		Thread.sleep(3000);
		
		WebElement arrow6 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[4]/a[4]/div/div[2]/img"));  // down load arrow
		String spwh6=driver.getWindowHandle();              //parent address
		System.out.println(spwh2);                          // print parent address
		arrow6.click();                                    // click download arrow
		Thread.sleep(3000);
		Set<String> sallwh6=driver.getWindowHandles();       // get all address
		for(String swh6:sallwh6)
		{
			System.out.println(swh6);
			if(!spwh6.equals(swh6)) {
				driver.switchTo().window(spwh6);              // switch back to parent address
			}
		}
		Thread.sleep(3000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,600)");
		
		
	}
	

}
