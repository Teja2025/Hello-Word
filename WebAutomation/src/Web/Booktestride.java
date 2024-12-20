

package Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Booktestride {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./jars/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ultraviolette.com");
		Thread.sleep(3000);
		driver.manage().window().maximize(); //maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BOOK TEST RIDE']")).click();    //book test ride
		Thread.sleep(3000);
	/*	driver.findElement(By.xpath("//div[text()='F77']")).click();         //f77
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
		driver.findElement(By.xpath("//input[@id='enteredFirstName']")).sendKeys("paru");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='enteredLastName']")).sendKeys("roopa");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='phone-text']")).sendKeys("8152946391");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='enteredEmailId']")).sendKeys("tejashwini.c@ultraviolette.com");
		Thread.sleep(5000);
		WebElement w =driver.findElement(By.xpath("//*[@id=\"dropdown_inputField\"]/div/div[1]/div[2]"));
		Actions ab=new Actions(driver);
		ab.moveToElement(w).click().perform();
		Thread.sleep(3000);
		WebElement w1= driver.findElement(By.xpath("//div[text()='MUMBAI']"));
		Actions bc=new Actions(driver);
		bc.moveToElement(w1).click().perform();
		Thread.sleep(3000);
		WebElement w2= driver.findElement(By.xpath("//*[@id=\"TestrideNextButton\"]/div/button/div"));
		Actions cd=new Actions(driver);
		cd.moveToElement(w2).click().perform();
		Thread.sleep(3000);
		}
	}
