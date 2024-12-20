package Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Squadron {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='SQUADRON']")).click();       //squadron
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[text()='SMART TECH']")).click(); //smarttech
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='UV RACING']")).click();    //uv racing 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cursor-pointer']")).click(); // logo
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
		WebElement torget= driver.findElement(By.xpath("//div[text()='SQUADRON']"));   //squadron
		Actions a=new Actions(driver);
		a.moveToElement(torget).click().perform();
		Thread.sleep(3000);
		JavascriptExecutor b=(JavascriptExecutor)driver;   
		b.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='go_to_leaderboard']")).click();   // leaderboard page
		Thread.sleep(3000);
		driver.navigate().back();   // squadron
		Thread.sleep(3000);
		
    	JavascriptExecutor e=(JavascriptExecutor)driver;  // squadron
		e.executeScript("window.scrollTo(0,2500)");
		Thread.sleep(3000);
		
		WebElement ww1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[1]/div/div/div/img")); //drag and drop
		WebElement ww2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/img"));
		WebElement ww3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[3]/div/div/div/img"));
		WebElement ww4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[6]/div[3]/div/div/div/div/div/div/div/div[4]/div/div/div/img"));
		
		Actions s6=new Actions(driver);
		s6.dragAndDrop(ww1,ww2).build().perform();
		Thread.sleep(3000);	
		
		Actions t6=new Actions(driver);
		t6.dragAndDrop(ww2,ww3).build().perform();
		Thread.sleep(3000);	
		
		Actions v6=new Actions(driver);
		v6.dragAndDrop(ww3,ww4).build().perform();
		Thread.sleep(3000);	
		
		JavascriptExecutor f=(JavascriptExecutor)driver;  //  squadron
		f.executeScript("window.scrollTo(0,3200)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='EXPLORE WALLPAPERS']")).click(); // explore wallpaper
		Thread.sleep(3000);
		driver.navigate().back(); // squadron
		Thread.sleep(3000);
		JavascriptExecutor s=(JavascriptExecutor)driver;
		s.executeScript("window.scrollTo(0,14000)");    //end
	}}

