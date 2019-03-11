package grid01;

import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ggg {
	
	  private WebDriver driver;
	  private String baseUrl;
	  @BeforeClass
	  public void setUp() throws Exception {
		  DesiredCapabilities a=DesiredCapabilities.chrome();
		   driver=new RemoteWebDriver(new URL("http://192.168.64.1:6666/wd/hub/"),a);
	    baseUrl = "http://localhost:8080/examsys/login.thtml";
	    
	   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitled() throws Exception {
	    driver.get(baseUrl );
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("hujianming");
	    driver.findElement(By.name("userpass")).clear();
	    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
	    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("π‹¿Ì‘±");
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector("button.tm_btn")).click();
	    Thread.sleep(8000);
	    driver.switchTo().frame("main");
	    String sy=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
	    System.out.println(sy);
	  }

	  @AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();
	
	 
	    }
	  }


