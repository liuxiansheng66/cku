package day11;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dzsc {
	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
}
@Test //登录
public void a(){
	driver.get(url);
	driver.findElement(By.name("c_name")).sendKeys("dddddd");
	driver.findElement(By.name("c_pass")).sendKeys("111");
	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
}
@Test//用商品类型搜索
	public void b() {
	WebElement s=driver.findElement(By.name("select_type"));
	Select s1= new Select(s);
	s1.selectByIndex(2);
	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	}
	@Test//用商品名搜索
	public void c() throws InterruptedException {
	WebElement ss2=driver.findElement(By.name("select_type"));
	Select s2= new Select(ss2);
	s2.selectByIndex(2);
	Thread.sleep(1000);
	driver.findElement(By.name("select_p_name")).sendKeys("海尔");
 	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
 	Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	}
	@Test//用商品类型和商品名精确搜索
	public void d() throws InterruptedException {
 	WebElement s22=driver.findElement(By.name("select_type"));
	Select s21= new Select(s22);
	s21.selectByIndex(2);
	driver.findElement(By.name("select_p_name")).sendKeys("美的");
	Thread.sleep(1000);
 	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
 	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();

	}
	@AfterClass
	public void tuichu() {
		driver.close();
	}
}
