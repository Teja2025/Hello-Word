package Web;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Careerpage {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();  // maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CAREERS']")).click();        //careers
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//div[text()='F77']")).click();           //f77
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SMART TECH']")).click();    //  SMART TECH
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();     // UV RACING
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // LOGO
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();      //configure
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();  //book test ride
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();            // sign in
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[1]/div[1]")).click();   // back.....book test ride
		Thread.sleep(3000);
		WebElement w1= driver.findElement(By.xpath("//div[text()='CAREERS']"));      //careers
		Actions a=new Actions(driver);
		a.moveToElement(w1).click().perform();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/button/div/div")).click(); //work with us
		Thread.sleep(3000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;  // scroll back....landing page.
		j.executeScript("window.scrollTo(2000,-0)");
		Thread.sleep(3000); 
		
		JavascriptExecutor k=(JavascriptExecutor)driver;  //scroll up to video
		k.executeScript("window.scrollTo(0,700)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/img")).click(); // click the video
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[1]/div[2]/video")).click(); elementnotinteractableexeption.
		//Thread.sleep(3000); 
		
		JavascriptExecutor e=(JavascriptExecutor)driver;  //scroll the image
		e.executeScript("window.scrollTo(700,1300)");
		Thread.sleep(3000);

		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[2]")).click();    // click the forword arrow 3 times
			Thread.sleep(3000);
		}
		for(int i=1;i<=3;i++) {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[4]/div[2]/div/button[1]")).click();     // click the backword arrow 3 times
			Thread.sleep(3000);
		}
		 
		 
		JavascriptExecutor f=(JavascriptExecutor)driver;       // scroll the next image
		f.executeScript("window.scrollTo(1300,1700)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[2]")).click();   // click the forword arrow
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[5]/div[2]/div/button[1]")).click();    // // click the backword arrow
		Thread.sleep(3000);

		JavascriptExecutor g=(JavascriptExecutor)driver;  // scroll the current openings
		g.executeScript("window.scrollTo(1300,2100)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lead");    // search the lead
		Thread.sleep(3000);

		WebElement q=driver.findElement(By.xpath("//input[@type='text']"));         // clear the search
		Thread.sleep(3000);
		q.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		q.sendKeys(Keys.BACK_SPACE);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dghdhdh");    // search the dghdhdh
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).clear();                // clear the dghdhdh
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lead");       // search the lead   
		Thread.sleep(3000);
		
		JavascriptExecutor h=(JavascriptExecutor)driver;                             // scroll upto last job
		h.executeScript("window.scrollTo(2100,3700)");
		Thread.sleep(3000);
		
        WebElement w = driver.findElement(By.xpath("//a[text()='Lead Mechatronics Engineer']"));   // /////// click the last job.....navigate the job details 
        Actions a1=new Actions(driver);
        a1.moveToElement(w).click().perform();
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess']")).click(); // click the i'm interested...application
		Thread.sleep(4000);
		
	    driver.findElement(By.xpath("//a[text()='Job details']")).click();                // click the job details.....back to job details page
	    Thread.sleep(3000);
	    
	  /*  driver.findElement(By.xpath("//lyte-yield[text()='Share job via email']")).click();       // click share job via email
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);*/
	    
	  WebElement q1=  driver.findElement(By.xpath("//span[@class='fa fa-facebook']"));  // click facebook
	  String pwh=driver.getWindowHandle();   //parent address
		System.out.println(pwh);                 // print parent address
		q1.click();                        // click download
		Thread.sleep(3000);

		Set<String> allwh=driver.getWindowHandles();    // get all address
		for(String wh:allwh)
		{
			System.out.println(wh);
			if(!pwh.equals(wh)) {
				driver.switchTo().window(pwh);           // switch back to parent address
			}

		} 
	Thread.sleep(3000);
	   
	    
	    WebElement q2=driver.findElement(By.xpath("//span[@class='fa fa-twitter']"));                // click twitter
	    String spwh=driver.getWindowHandle();   //parent address
		System.out.println(spwh);                 // print parent address
		q2.click();                        // click download
		Thread.sleep(3000);

		Set<String> sllwh=driver.getWindowHandles();    // get all address
		for(String swh:sllwh)
		{
			System.out.println(swh);
			if(!spwh.equals(swh)) {
				driver.switchTo().window(spwh);           // switch back to parent address
			}

		} 
		Thread.sleep(3000);
	    
	    WebElement q3=driver.findElement(By.xpath("//span[@class='fa fa-linkedin']"));                // click linkedin
	    String tpwh=driver.getWindowHandle();   //parent address
	  		System.out.println(tpwh);                 // print parent address
	  		q3.click();                        // click download
	  		Thread.sleep(3000);

	  		Set<String> tllwh=driver.getWindowHandles();    // get all address
	  		for(String twh:tllwh)
	  		{
	  			System.out.println(twh);
	  			if(!tpwh.equals(twh)) {
	  				driver.switchTo().window(tpwh);           // switch back to parent address
	  			}

	  		} 
	  		Thread.sleep(3000);
	    
	    WebElement q4 =driver.findElement(By.xpath("//span[@class='fa fa-whatsapp']"));                // click watsaap
	    String fpwh=driver.getWindowHandle();   //parent address
  		System.out.println(fpwh);                 // print parent address
  		q4.click();                        // click download
  		Thread.sleep(3000);

  		Set<String> fllwh=driver.getWindowHandles();    // get all address
  		for(String fwh:fllwh)
  		{
  			System.out.println(fwh);
  			if(!fpwh.equals(fwh)) {
  				driver.switchTo().window(fpwh);           // switch back to parent address
  			}

  		} 
  		Thread.sleep(3000);
	    WebElement q5 =driver.findElement(By.xpath("//span[@class='fa fa-telegram']"));                // click telegram
	    String qfpwh=driver.getWindowHandle();   //parent address
  		System.out.println(qfpwh);                 // print parent address
  		q5.click();                        // click download
  		Thread.sleep(3000);

  		Set<String> qfllwh=driver.getWindowHandles();    // get all address
  		for(String qfwh:qfllwh)
  		{
  			System.out.println(qfwh);
  			if(!qfpwh.equals(qfwh)) {
  				driver.switchTo().window(qfpwh);           // switch back to parent address
  			}

  		} 
  		Thread.sleep(3000);
	   
	    
	 //   driver.findElement(By.xpath("//span[@class='fa fa-link']"));    // link copied
		
		
	   JavascriptExecutor i=(JavascriptExecutor)driver;                            
	   i.executeScript("window.scrollTo(0,2500)");
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//span[text()='View all jobs']")).click();     // click View all jobs....the future takes off with us.
	   Thread.sleep(3000);
	    
	    driver.navigate().back();    // back to job details page
	    Thread.sleep(3000);
	    
	 WebElement q6 =driver.findElement(By.xpath("//a[@class='cw-poweredby']")); // click zohorecruit
	  String qspwh=driver.getWindowHandle();   //parent address
		System.out.println(qspwh);                 // print parent address
		q6.click();                        // click download
		Thread.sleep(3000);

		Set<String> qsllwh=driver.getWindowHandles();    // get all address
		for(String qswh:qsllwh)
		{
			System.out.println(qswh);
			if(!qfpwh.equals(qswh)) {
				driver.switchTo().window(qfpwh);           // switch back to parent address
			}

		} 
	 Thread.sleep(4000);
	 	
	 driver.findElement(By.xpath("//span[@class='cw-long-arrow-top']")).click(); //click the arrow....it goes top.
	 Thread.sleep(3000);
	 
	 JavascriptExecutor p=(JavascriptExecutor)driver;     //scroll upto end 
	 p.executeScript("window.scrollTo(0,2200)");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess']")).click(); // click the i'm interested
	 Thread.sleep(4000);
	 
	 WebElement t3= driver.findElement(By.xpath("//span[text()=' or drag and drop it here']"));
	 Actions d=new Actions(driver);
	 d.moveToElement(t3).click().perform();
	 
	 Runtime.getRuntime().exec("C:\\New folder\\autooscript.exe");
	 Thread.sleep(20000);
	 
	 JavascriptExecutor jk=(JavascriptExecutor)driver;
	 jk.executeScript("window.scrollTo(0,500)");
	 Thread.sleep(3000);
	 
	WebElement w34= driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003151\"]/div/lyte-input/div/input"));
	 Thread.sleep(3000);
	Actions a4=new Actions(driver);
	a4.moveToElement(w34).sendKeys("paru").perform();
	 Thread.sleep(3000);
	WebElement w43= driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003161\"]/div/div/lyte-input/div/input"));
	 Thread.sleep(3000);
	Actions a43=new Actions(driver);
	a43.moveToElement(w43).sendKeys("1234567890").perform();
	 Thread.sleep(3000);
	
	/* JavascriptExecutor kl=(JavascriptExecutor)driver;
	 kl.executeScript("window.scrollTo(500,1100)");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003199\"]/div/lyte-input/div/input")).sendKeys("20000");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"rec-form_89246000000003197\"]/div/lyte-input/div/input")).sendKeys("30000");
	 Thread.sleep(3000);
	 
/*	 JavascriptExecutor l=(JavascriptExecutor)driver;
	 l.executeScript("window.scrollTo(1100,1900)");
	 Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//lyte-yield[text()='Submit Application']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//lyte-yield[text()='Ok']")).click();
	 Thread.sleep(3000);
	 JavascriptExecutor d2=(JavascriptExecutor)driver;
	 d2.executeScript("window.scrollTo(0,2200)");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[text()='Visit website']")).click();
	 Thread.sleep(3000);*/
	 

	}
	}


