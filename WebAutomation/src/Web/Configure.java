package Web;

//import java.util.Set;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Configure {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CONFIGURE']")).click();   //configure
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//div[text()='F77']")).click();        //f77
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='SMART TECH']")).click(); //smarttech
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // logo
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='CAREERS']")).click();          //careers
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();    //book test ride
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='f77Mob']")).click();             // sign in   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[1]/div[1]/div[1]")).click();  // back.....book test ride
		Thread.sleep(3000);
		WebElement torget= driver.findElement(By.xpath("//div[text()='CONFIGURE']"));    //configure
		Actions a=new Actions(driver);
		a.moveToElement(torget).click().perform();
		Thread.sleep(3000);*/

		driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
		Thread.sleep(3000);
		
	/*	for(int i=1;i<=5;i++)
		{
		WebElement w=driver.findElement(By.xpath("//div[contains(@class,'absolute right-4 z-50 cursor-pointer')]"));   // images front arrow
		Actions g1=new Actions(driver);
		g1.moveToElement(w).click().perform();
		Thread.sleep(3000);
		}
		Thread.sleep(20000);
		
		for(int i=1;i<=5;i++) {
		WebElement w2=driver.findElement(By.xpath("//div[contains(@class,'absolute left-4 z-50 cursor-pointer rotate-180 ')]"));    // images back arrow
		Actions g2=new Actions(driver);
		g2.moveToElement(w2).click().perform();
		Thread.sleep(3000);
		} 
		
		driver.findElement(By.xpath("//div[text()='COMPARE VARIANTS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div[1]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='POTENTIAL FUEL SAVINGS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"VARIANT_SIDE_PANEL\"]/div/div/div/div[1]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/div/div/button[1]")).click();
		Thread.sleep(3000);*/
	
		WebElement w1=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
		Actions a90=new Actions(driver);
		a90.moveToElement(w1).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(3000);
	/*	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		Thread.sleep(3000);


		JavascriptExecutor j=(JavascriptExecutor)driver;   //scroll to shadow
		j.executeScript("window.scrollTo(0,100)");

		WebElement w2= driver.findElement(By.xpath("//div[text()='SHADOW']"));      //shadow
		Actions b=new Actions(driver);
		b.moveToElement(w2).click().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		Thread.sleep(3000);

		WebElement w3=driver.findElement(By.xpath("//div[text()='AIRSTRIKE']"));       //airstaike
		Actions c=new Actions(driver);
		c.moveToElement(w3).click().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[3]/div/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/div/div/img")).click();
		Thread.sleep(3000);*/
		
		JavascriptExecutor k=(JavascriptExecutor)driver;           // scroll upto optional upgrades
		k.executeScript("window.scrollTo(100,4500)");
		
		driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
		Thread.sleep(3000);
		
		JavascriptExecutor l=(JavascriptExecutor)driver;      // scroll 
		l.executeScript("window.scrollTo(4500,4700)");
		Thread.sleep(3000);

		WebElement t1=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
		Actions a1=new Actions(driver);
		a1.moveToElement(t1).click().perform();
		Thread.sleep(3000);

		WebElement t2=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
		Actions a2=new Actions(driver);
		a2.moveToElement(t2).click().perform();
		Thread.sleep(3000);

		JavascriptExecutor m=(JavascriptExecutor)driver;      //scroll 
		m.executeScript("window.scrollTo(4700,5000)");
		Thread.sleep(3000);

		WebElement t3=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
		Actions a3=new Actions(driver);
		a3.moveToElement(t3).click().perform();
		Thread.sleep(3000);

		WebElement t4=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
		Actions a4=new Actions(driver);
		a4.moveToElement(t4).click().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("///input[@placeholder='ENTER EMAIL']")).sendKeys("eli2@hometownyi.com");   // email
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
//		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		Thread.sleep(20000);
//		
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]/div/div[1]")).click();
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("eli2@hometownyi.com");   // email
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
//		Thread.sleep(20000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='FIRST AND LAST NAME']")).sendKeys("Tejashwini");
//		Thread.sleep(3000);
//		
//		WebElement w45=driver.findElement(By.xpath("//select[@id='country']"));
//		Select s =new Select(w45);
//		s.selectByVisibleText("India");
//		
//		driver.findElement(By.xpath("//input[@placeholder='PINCODE']")).sendKeys("2345");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).sendKeys("8152946391");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]")).click();
//		Thread.sleep(3000);
		
		
		
		
	/*  WebElement we= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));//arrow....configure main page.
	  Thread.sleep(5000);
      Actions at=new Actions(driver);
      at.moveToElement(we).click().build().perform();
      Thread.sleep(5000);
		
    	driver.findElement(By.xpath("//input[@class='signin_input__7mAAh']")).sendKeys("tejashwini.c@ultraviolette.com");   // email
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();                       // check box
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@class='signin_proceedError__pcOPi']")).click();      //  proceed
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[text()='PROCEED']")).click();                //proceed
		Thread.sleep(20000);
		
	  WebElement we= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div[1]/div[1]/div[3]/div[3]/img"));//arrow....configure main page.
	  Thread.sleep(5000);
      Actions at=new Actions(driver);
      at.moveToElement(we).click().build().perform();
      Thread.sleep(5000);
      
   	driver.findElement(By.xpath("//span[text()='PROCEED TO NEXT STAGE']")).click();  // proceed to next stage
	Thread.sleep(3000);
	WebElement w10=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
	Actions a60=new Actions(driver);
	a60.moveToElement(w10).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor k1=(JavascriptExecutor)driver;           // scroll upto optional upgrades
	k1.executeScript("window.scrollTo(100,4500)");
	
	driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
	Thread.sleep(3000);
	
	JavascriptExecutor l3=(JavascriptExecutor)driver;      // scroll 
	l3.executeScript("window.scrollTo(4500,4700)");
	Thread.sleep(3000);

	WebElement tq=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
	Actions ab1=new Actions(driver);
	ab1.moveToElement(tq).click().perform();
	Thread.sleep(3000);

	WebElement tq1=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
	Actions ac5=new Actions(driver);
	ac5.moveToElement(tq1).click().perform();
	Thread.sleep(3000);

	JavascriptExecutor m1=(JavascriptExecutor)driver;      //scroll 
	m1.executeScript("window.scrollTo(4700,5000)");
	Thread.sleep(3000);

	WebElement tq3=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
	Actions aq3=new Actions(driver);
	aq3.moveToElement(tq3).click().perform();
	Thread.sleep(3000);

	WebElement tq4=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
	Actions aq4=new Actions(driver);
	aq4.moveToElement(tq4).click().perform();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='< EDIT YOUR DESIGN']")).click();         // edit your design
	Thread.sleep(3000);
	
	WebElement w0=driver.findElement(By.xpath("//div[text()='LASER']"));   // laser
	Actions a0=new Actions(driver);
	a0.moveToElement(w0).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/div/div/img")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor k10=(JavascriptExecutor)driver;           // scroll upto optional upgrades
	k10.executeScript("window.scrollTo(100,4500)");
	
	driver.findElement(By.xpath("//h2[text()='Optional upgrades']")).click();    // optional upgrades  
	Thread.sleep(3000);
	
	JavascriptExecutor l30=(JavascriptExecutor)driver;      // scroll 
	l30.executeScript("window.scrollTo(4500,4700)");
	Thread.sleep(3000);

	WebElement tq0=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[1]/div/div[3]/div"));   // 1
	Actions ab10=new Actions(driver);
	ab10.moveToElement(tq0).click().perform();
	Thread.sleep(3000);

	WebElement tq10=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[2]/div/div[3]/div"));    //2
	Actions ac50=new Actions(driver);
	ac50.moveToElement(tq10).click().perform();
	Thread.sleep(3000);

	JavascriptExecutor m10=(JavascriptExecutor)driver;      //scroll 
	m10.executeScript("window.scrollTo(4700,5000)");
	Thread.sleep(3000);

	WebElement tq30=	driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[3]/div/div[3]/div"));     // 3
	Actions aq30=new Actions(driver);
	aq30.moveToElement(tq30).click().perform();
	Thread.sleep(3000);

	WebElement tq40=driver.findElement(By.xpath("//*[@id=\"section-five\"]/div[2]/div[4]/div/div[3]/div"));        // 4
	Actions aq40=new Actions(driver);
	aq40.moveToElement(tq40).click().perform();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='CONFIRM CONFIGURATION']")).click();                         // confirm configuration
	Thread.sleep(3000);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,3000)");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Booking agreement']")).click();
	Thread.sleep(3000);
	String pw=driver.getWindowHandle();
	System.out.println(pw);
	Set<String> awh=driver.getWindowHandles();
	System.out.println(awh);
	for(String wh:awh)
	{
	if(!pw.equals (wh))
	{
	driver.switchTo().window(pw);
	}
	}
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='PAY ₹ 5,000']")).click();
	Thread.sleep(5000);
	WebElement v=driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div/div[2]/div/div[2]/div[1]/button"));
	Actions g=new Actions(driver);
	g.moveToElement(v).click().perform();
	Thread.sleep(5000);
    WebElement b1=driver.findElement(By.xpath("//div[text()='Edit Contact']"));
    Actions s=new Actions(driver);
    s.moveToElement(b1).click().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Cancel']")).click();
	Thread.sleep(3000);
	Alert a99=driver.switchTo().alert();
	a99.accept();
	driver.findElement(By.xpath("//div[text()='GO BACK TO CONFIGURE']")).click();
	Thread.sleep(3000);*/
	
	}
}

