package day12;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ee {
	static WebDriver driver;
	static String url;
@BeforeClass
public void tt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
}
@Test //��¼
public void cf(){
	driver.get(url);
	driver.findElement(By.name("c_name")).sendKeys("qqqqqq");
	driver.findElement(By.name("c_pass")).sendKeys("123");
	driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
}
@Test//����Ʒ��������
	public void lol() {
	WebElement s=driver.findElement(By.name("select_type"));
	Select s1= new Select(s);
	s1.selectByIndex(2);
	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	}
	@Test//����Ʒ������
	public void qq() throws InterruptedException {
	WebElement ff=driver.findElement(By.name("select_type"));
	Select s1= new Select(ff);
	s1.selectByIndex(2);
	driver.findElement(By.name("select_p_name")).sendKeys("����");
 	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
 	Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();
	}
	@Test//����Ʒ���ͺ���Ʒ����ȷ����
	public void fc() throws InterruptedException {
 	WebElement s2=driver.findElement(By.name("select_type"));
	Select gg= new Select(s2);
	gg.selectByIndex(2);
	driver.findElement(By.name("select_p_name")).sendKeys("����");
	Thread.sleep(1000);
 	driver.findElement(By.xpath("/html/body/center[3]/form/table/tbody/tr/td[5]/input")).click();
 	driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/a")).click();

	}
	@AfterClass
	public void tuichu() {
		driver.close();
	}
}

