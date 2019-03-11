package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gouwu {
	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
}
@Test //µÇÂ¼
public void a() throws InterruptedException{
	driver.get(url);
	driver.findElement(By.name("c_name")).sendKeys("dddddd");
	driver.findElement(By.name("c_pass")).sendKeys("111");
	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();

}
 @Test//Òâ¼û·´À¡
 public void b() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
 }
 @AfterClass
 public void c() {
	 driver.close();
 }
}
