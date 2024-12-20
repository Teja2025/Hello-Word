package Web;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Orangehrm extends Baseclass {
	
	

	@Test
	public void loginaplication() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}

		
	
	}


