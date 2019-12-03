import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class RestJavaTest {
	public WebDriver driver;


  @Test
  public void main() {
	 
	       driver.findElement(By.className("//div[@id='nav-tools']/a[2]")).click();
	       driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field")).sendKeys("9885678567");
	       driver.findElement(By.className("a-button-input")).click();
	       System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	       driver.findElement(By.className("a-alert-heading"));
	   }
	  
	   @BeforeMethod
	  
	   public void beforeMethod() throws Exception {
		   System.setProperty("webdriver.gecko.driver", "C:/Users/bnallagu/Documents/eclipse/WorkSpace/RestAssuredLearning/drivers/geckodriver.exe");
	       driver = new FirefoxDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.get("https://www.amazon.in/");
	       Thread.sleep(4000);
	  
	   }
	  
	   @AfterMethod
	  
	   public void afterMethod() {
	       driver.quit();
	  
	   }
	  
	 }