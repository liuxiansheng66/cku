package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class houtai {
	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
}
@Test//登录后台
public void a() throws InterruptedException{
	driver.get(url);
	driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
	driver.findElement(By.name("a_name")).sendKeys("admin");
	driver.findElement(By.name("a_pass")).sendKeys("admin");
	driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
}
@Test//添加一个商品主分类
public void b() {
	driver.switchTo().frame(0);
	driver.switchTo().frame("Left");
	driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();//点击添加商品主分类
	driver.switchTo().parentFrame();
    driver.switchTo().frame("Rigth");
	driver.findElement(By.name("t_name")).sendKeys("烧水器系列");
    driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();

}
@Test//删除订单
public void c() {
	driver.switchTo().parentFrame();
	driver.switchTo().frame("Left");
    driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a")).click();
    driver.switchTo().parentFrame();
    driver.switchTo().frame("Rigth");
    driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td[6]/span/a")).click();

}
@Test//发布公告
public void d() {
	driver.switchTo().parentFrame();
	driver.switchTo().frame("Left");
	driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame("Rigth");
	driver.findElement(By.name("n_message")).sendKeys("警告！警告！系统负载！即将爆炸！");
	driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
}
@AfterClass
public void e() {
	 driver.close();
}
}
