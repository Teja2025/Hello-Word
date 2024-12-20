package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Smarttech {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='SMART TECH']")).click(); //smarttech
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
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
		WebElement torget= driver.findElement(By.xpath("//div[text()='SMART TECH']"));    //smattech
		Actions a=new Actions(driver);
		a.moveToElement(torget).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor aa=(JavascriptExecutor)driver;
		aa.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button/img")).click(); //unmute
        Thread.sleep(3000);
        JavascriptExecutor b=(JavascriptExecutor)driver;
		b.executeScript("window.scrollTo(1500,2500)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[2]/h1")).click(); // towing alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]/h1")).click();  // movement & fall alert
		Thread.sleep(3000);
		JavascriptExecutor c=(JavascriptExecutor)driver;
		c.executeScript("window.scrollTo(1500,5000)"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[4]/div[2]/div/div/img")).click(); // uvdsc clickon
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[6]/div[4]/div[2]/div/video")).click(); // uvdsc clickoff
		Thread.sleep(3000);
		
		JavascriptExecutor d=(JavascriptExecutor)driver;
		d.executeScript("window.scrollTo(5000,5800)");
		
	    WebElement w1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[1]/div/video")); // drag and drop sliders
	    WebElement w2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[2]/div/video"));
	    WebElement w3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[7]/section/div/div/div[3]/div/video"));
	    Actions f=new Actions(driver);
		f.dragAndDrop(w1,w2).perform();
	    Thread.sleep(3000);
	    Actions g=new Actions(driver);
		g.dragAndDrop(w2,w3).perform();
	    Thread.sleep(3000);
	    Actions h=new Actions(driver);
		h.dragAndDrop(w3,w1).perform();
	    Thread.sleep(3000);
		JavascriptExecutor dd=(JavascriptExecutor)driver;
		dd.executeScript("window.scrollTo(5800,6900)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[8]/img")).click(); //video on
		Thread.sleep(3000);
		driver.findElement(By.xpath("//video[contains(@poster,'https://d2atk76x06g5eh.cloudfront.net/smarttech/lockdown/lockdown_thumb_1.webp')]")).click(); // video off
		Thread.sleep(3000);
		
		JavascriptExecutor ddd=(JavascriptExecutor)driver;
		ddd.executeScript("window.scrollTo(6900,8000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[3]/h1")).click();  // charge limit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[1]/h1")).click();   // vehicle diagnostics
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[2]/h1")).click();   //ride analytics
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[4]/h1")).click();   // find my f77
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[9]/div/div[2]/div[4]/div[2]/div/div[5]/h1")).click();    // controls in yours palm
		Thread.sleep(3000);
        JavascriptExecutor ss=(JavascriptExecutor)driver;
		ss.executeScript("window.scrollTo(8000,8500)");
		Thread.sleep(3000);
		
		for(int i=1; i<=2;i++) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[11]/div[1]/div/button/img")).click(); //unmute and mute
		Thread.sleep(3000);
		}
		
		JavascriptExecutor hh=(JavascriptExecutor)driver;
		hh.executeScript("window.scrollTo(8500,9800)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();//c
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();//b
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();//g
		Thread.sleep(3000);

     	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[2]/img")).click();//day
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[2]")).click();//c
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[3]")).click();//b
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[1]/h1[1]")).click();//g
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[2]/h1")).click();// top to see  details
		Thread.sleep(3000);
		
	WebElement aa1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[7]/div/img"));
	Actions a1=new Actions(driver);
	a1.moveToElement(aa1).click().perform();
    Thread.sleep(3000); 
		
    WebElement bb1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[6]/div/img"));
    Actions b1=new Actions(driver);
	b1.moveToElement(bb1).click().perform();
    Thread.sleep(3000);
    
	WebElement cc1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[5]/div/img"));
	Actions c1=new Actions(driver);
	c1.moveToElement(cc1).click().perform();
    Thread.sleep(3000); 
    
	WebElement dd1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[4]/div/img"));
	Actions d1=new Actions(driver);
	d1.moveToElement(dd1).click().perform();
	Thread.sleep(3000); 
	    
	    
	WebElement ee1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[2]/div/img"));
	Actions e1=new Actions(driver);
	e1.moveToElement(ee1).click().perform();
	Thread.sleep(3000);
		
	WebElement ff1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[1]/div/img"));
	Actions f1=new Actions(driver);
	f1.moveToElement(ff1).click().perform();
	Thread.sleep(3000);
		
		
	WebElement gg1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[3]/div/img"));
	Actions g1=new Actions(driver);
	g1.moveToElement(gg1).click().perform();
	Thread.sleep(3000);
	
	WebElement hh1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[8]/div/img"));
	Actions h1=new Actions(driver);
	h1.moveToElement(hh1).click().perform();
	Thread.sleep(3000);
	
    WebElement ii1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[9]/div/img"));
    Actions i1=new Actions(driver);
    i1.moveToElement(ii1).click().perform();
    Thread.sleep(3000);

    WebElement jj1=   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[10]/div/img"));
    Actions j1=new Actions(driver);
    j1.moveToElement(jj1).click().perform();
    Thread.sleep(3000);

	 WebElement kk1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[12]/div/img"));
	  Actions k1=new Actions(driver);
	  k1.moveToElement(kk1).click().perform();
	  Thread.sleep(3000);
	  
	WebElement ll1=    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[11]/div/img"));
    Actions l1=new Actions(driver);
	l1.moveToElement(ll1).click().perform();
	Thread.sleep(3000);
	  
		
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[3]/div[3]")).click();// night
	Thread.sleep(3000); 
	
	WebElement mm1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[7]/div/img"));
	Actions m1=new Actions(driver);
	m1.moveToElement(mm1).click().perform();
    Thread.sleep(3000); 
		
    WebElement nn1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[6]/div/img"));
    Actions n1=new Actions(driver);
	n1.moveToElement(nn1).click().perform();
    Thread.sleep(3000);
    
	WebElement oo1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[5]/div/img"));
	Actions o1=new Actions(driver);
	o1.moveToElement(oo1).click().perform();
    Thread.sleep(3000); 
    
	WebElement pp1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[4]/div/img"));
	Actions p1=new Actions(driver);
	p1.moveToElement(pp1).click().perform();
	Thread.sleep(3000); 
	    
	    
	WebElement rr1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[2]/div/img"));
	Actions r1=new Actions(driver);
	r1.moveToElement(rr1).click().perform();
	Thread.sleep(3000);
		
	WebElement ss1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[1]/div/img"));
	Actions s1=new Actions(driver);
	s1.moveToElement(ss1).click().perform();
	Thread.sleep(3000);
		
		
	WebElement tt1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[3]/div/img"));
	Actions t1=new Actions(driver);
	t1.moveToElement(tt1).click().perform();
	Thread.sleep(3000);
	
	WebElement uu1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[8]/div/img"));
	Actions u1=new Actions(driver);
	u1.moveToElement(uu1).click().perform();
	Thread.sleep(3000);
	
    WebElement vv1=	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[9]/div/img"));
    Actions v1=new Actions(driver);
    v1.moveToElement(vv1).click().perform();
    Thread.sleep(3000);

    WebElement ww11=   driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[10]/div/img"));
    Actions w11=new Actions(driver);
    w11.moveToElement(ww11).click().perform();
    Thread.sleep(3000);

	 WebElement xx1=  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[12]/div/img"));
	  Actions x1=new Actions(driver);
	  x1.moveToElement(xx1).click().perform();
	  Thread.sleep(3000);
	  
	WebElement yy1=    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[1]/div[11]/div/img"));
    Actions y1=new Actions(driver);
	y1.moveToElement(yy1).click().perform();
	Thread.sleep(3000);
	  
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[12]/div/div[3]/div[2]/h1")).click(); // top to see details
	Thread.sleep(3000);
	
	JavascriptExecutor e=(JavascriptExecutor)driver;
	e.executeScript("window.scrollTo(9800,11000)");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[1]/div[14]/a/img")).click(); // book your f77....configure
	Thread.sleep(3000);
	driver.navigate().back(); // smattech
	Thread.sleep(3000);
		
	JavascriptExecutor ggg=(JavascriptExecutor)driver;
	ggg.executeScript("window.scrollTo(0,11000)");     // end
	Thread.sleep(3000);
	
	
		}
	}
