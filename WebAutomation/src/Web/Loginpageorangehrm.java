package Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageorangehrm {                          //declaration
@FindBy(xpath="//input[@name='username']")
private WebElement untbx;
@FindBy(xpath="//input[@name='password']")
private WebElement pwtbx;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
private WebElement lgbtn;


public Loginpageorangehrm(WebDriver driver) {               // initialization
PageFactory.initElements(driver,this);
		}

public void setlogin(String un,String pw) throws InterruptedException {                  // utilization
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	Thread.sleep(4000);
	lgbtn.click();
	
	}

}
