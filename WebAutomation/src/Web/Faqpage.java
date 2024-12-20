package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faqpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(1000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing
		Thread.sleep(1000);

		JavascriptExecutor j=( JavascriptExecutor)driver;   //scroll
		j.executeScript("window.scrollTo(0,14000)");
		/* driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/div[2]/a")).click(); //faq's
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
		JavascriptExecutor js=( JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,14000)");*/
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/div[2]/a")).click(); //faq's
		Thread.sleep(3000);

	/*	WebElement download =driver.findElement(By.xpath("(//a[text()='here'])[1]"));  // Specs sheet
		String pwh=driver.getWindowHandle();   //parent address
		System.out.println(pwh);                 // print parent address
		download.click();                        // click download
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

		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,600)");

		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
		Thread.sleep(3000);

		WebElement b=driver.findElement(By.xpath("//a[text()='Configure']")); //configure
		String ph=driver.getWindowHandle();   //parent address
		System.out.println(ph);                 // print parent address
		b.click();                        // click download
		Thread.sleep(3000);

		Set<String> alwh=driver.getWindowHandles();    // get all address
		for(String wh:alwh)
		{
			System.out.println(wh);
			if(!ph.equals(wh)) {
				driver.switchTo().window(ph);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		WebElement c=driver.findElement(By.xpath("(//a[text()='here'])[2]"));
		String phl=driver.getWindowHandle();   //parent address
		System.out.println(phl);                 // print parent address
		c.click();                        // click download
		Thread.sleep(3000);

		Set<String> awh=driver.getWindowHandles();    // get all address
		for(String wh:awh)
		{
			System.out.println(wh);
			if(!ph.equals(wh)) {
				driver.switchTo().window(phl);           // switch back to parent address
			}
		}
		Thread.sleep(3000);
		JavascriptExecutor js2=(JavascriptExecutor)driver;
		js2.executeScript("window.scrollTo(600,1000)");	

		WebElement d=driver.findElement(By.xpath("(//a[text()='here'])[3]"));
		String ph2=driver.getWindowHandle();   //parent address
		System.out.println(ph2);                 // print parent address
		d.click();                        // click download
		Thread.sleep(3000);

		Set<String> aw=driver.getWindowHandles();    // get all address
		for(String wha:aw)
		{
			System.out.println(wha);
			if(!ph2.equals(wha)) {
				driver.switchTo().window(ph2);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("window.scrollTo(-1000,0)");	
		driver.findElement(By.xpath("//h1[text()='Product']")).click();
		Thread.sleep(3000);

		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);

		WebElement e=driver.findElement(By.xpath("(//a[text()='here'])[1]"));
		String ph3=driver.getWindowHandle();   //parent address
		System.out.println(ph3);                 // print parent address
		e.click();                        // click download
		Thread.sleep(3000);

		Set<String> awp=driver.getWindowHandles();    // get all address
		for(String whp:awp)
		{
			System.out.println(whp);
			if(!ph3.equals(whp)) {
				driver.switchTo().window(ph3);           // switch back to parent address
			}
		}
		Thread.sleep(3000);
		JavascriptExecutor js5=(JavascriptExecutor)driver;
		js5.executeScript("window.scrollTo(1500,1800)");
		Thread.sleep(3000);

		WebElement f=driver.findElement(By.xpath("(//a[text()='here'])[2]"));
		String ph4=driver.getWindowHandle();   //parent address
		System.out.println(ph4);                 // print parent address
		f.click();                        // click download
		Thread.sleep(3000);

		Set<String> ap=driver.getWindowHandles();    // get all address
		for(String wp:ap)
		{
			System.out.println(wp);
			if(!ph4.equals(wp)) {
				driver.switchTo().window(ph4);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		WebElement g=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 01']"));
		String ph5=driver.getWindowHandle();   //parent address
		System.out.println(ph5);                 // print parent address
		g.click();                        // click download
		Thread.sleep(3000);

		Set<String> api=driver.getWindowHandles();    // get all address
		for(String wpi:api)
		{
			System.out.println(wpi);
			if(!ph5.equals(wpi)) {
				driver.switchTo().window(ph5);           // switch back to parent address
			}
		}
		Thread.sleep(3000);

		WebElement h=driver.findElement(By.xpath("//a[text()='Pilot Talks Episode 02']"));
		String ph6=driver.getWindowHandle();   //parent address
		System.out.println(ph6);                 // print parent address
		h.click();                        // click download
		Thread.sleep(3000);

		Set<String> apt=driver.getWindowHandles();    // get all address
		for(String wpt:apt)
		{
			System.out.println(wpt);
			if(!ph6.equals(wpt)) {
				driver.switchTo().window(ph6);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		JavascriptExecutor js8=(JavascriptExecutor)driver;
		js8.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);


		driver.findElement(By.xpath("(//h3[text()='Battery'])[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//h3[text()='Range'])[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//h3[text()='Charging'])[1]")).click();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("(//h3[text()='Warranty'])[1]")).click();
		Thread.sleep(3000);	
		WebElement i=driver.findElement(By.xpath("(//a[text()='here'])[1]"));
		String ph7=driver.getWindowHandle();   //parent address
		System.out.println(ph7);                 // print parent address
		i.click();                        // click download
		Thread.sleep(3000);

		Set<String> apv=driver.getWindowHandles();    // get all address
		for(String wpv:apv)
		{
			System.out.println(wpv);
			if(!ph7.equals(wpv)) {
				driver.switchTo().window(ph7);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		JavascriptExecutor js9=(JavascriptExecutor)driver;
		js9.executeScript("window.scrollTo(-500,200)");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h1[text()='Sales']")).click();
		Thread.sleep(3000);
		WebElement k=	driver.findElement(By.xpath("//a[text()='link']"));
		String ph8=driver.getWindowHandle();   //parent address
		System.out.println(ph8);                 // print parent address
		k.click();                        // click download
		Thread.sleep(3000);

		Set<String> aph=driver.getWindowHandles();    // get all address
		for(String wph:aph)
		{
			System.out.println(wph);
			if(!ph7.equals(wph)) {
				driver.switchTo().window(ph8);           // switch back to parent address
			}
		}
		Thread.sleep(3000);	

		driver.findElement(By.xpath("(//h3[text()='Booking'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Finance'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='info@ultraviolette.com']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Purchase'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Accessories'])[1]")).click();
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("(//h1[text()='Service'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Service Frequency'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Free Service'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Service Scheduling'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='support@ultraviolette.com']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//h3[text()='RSA'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h3[text()='Home Maintenance'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//h1[text()='Public Charging'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js0=(JavascriptExecutor)driver;
		js0.executeScript("window.scrollTo(0,1400)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='080-694-53322'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor j9=(JavascriptExecutor)driver;
		j9.executeScript("window.scrollTo(1400,2000)");
		Thread.sleep(3000);
		

    }

}
