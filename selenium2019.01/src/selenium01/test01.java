package selenium01;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test01 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void setUp() throws Exception {
	  //第一步：定义浏览器
	  //定义火狐浏览器
	 /* System.setProperty("webdriver.firfox.bin", "F:\\firefox.exe");
    driver = new FirefoxDriver();*/
	  //定义谷歌浏览器
	  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    baseUrl = "http://blog.reallysimplethoughts.com/";
    //全局等待
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("img.size-thumbnail.wp-image-431")).click();
    driver.findElement(By.cssSelector("img.size-thumbnail.wp-image-431")).click();
    driver.findElement(By.cssSelector("img.attachment-900x900")).click();
  }
  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  }
