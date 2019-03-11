package selenium01;

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;

	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import org.openqa.selenium.support.ui.Select;
	public class junit01 {
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
	    baseUrl = "file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/demo1.html";
	    //全局等待
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test   //操作，测试用例
	  public void testUntitled() throws Exception {
		  //打开网址
	    driver.get(baseUrl);
	    driver.findElement(By.id("accountID")).clear();
	    driver.findElement(By.id("accountID")).sendKeys("电饭锅");
	    driver.findElement(By.id("passwordID")).clear();
	    driver.findElement(By.id("passwordID")).sendKeys("asdfg");
	    new Select(driver.findElement(By.id("areaID"))).selectByVisibleText("天津市");
	    driver.findElement(By.id("u1")).click();
	    driver.findElement(By.id("u2")).click();
	    driver.findElement(By.id("u3")).click();
	    driver.findElement(By.id("buttonID")).click();
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

