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
		  //��һ�������������
		  //�����������
		 /* System.setProperty("webdriver.firfox.bin", "F:\\firefox.exe");
	    driver = new FirefoxDriver();*/
		  //����ȸ������
		  System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    baseUrl = "file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/demo1.html";
	    //ȫ�ֵȴ�
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test   //��������������
	  public void testUntitled() throws Exception {
		  //����ַ
	    driver.get(baseUrl);
	    driver.findElement(By.id("accountID")).clear();
	    driver.findElement(By.id("accountID")).sendKeys("�緹��");
	    driver.findElement(By.id("passwordID")).clear();
	    driver.findElement(By.id("passwordID")).sendKeys("asdfg");
	    new Select(driver.findElement(By.id("areaID"))).selectByVisibleText("�����");
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

