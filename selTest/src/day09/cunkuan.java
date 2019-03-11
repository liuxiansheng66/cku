package day09;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cunkuan {
@Test
public void ck() throws InterruptedException {
    //用谷歌
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//输入网址
	driver.get("http://localhost:8080/Banksys_ssh/");
	//登录
	driver.findElement(By.name("userNO")).sendKeys("1545633089692");
	driver.findElement(By.name("password")).sendKeys("123456");
	Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();
//进入小框架
driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/p[2]/a")).click();
//回到主页面
driver.switchTo().parentFrame();
//进入另一个小框架
driver.switchTo().frame("mainFrame");
//存款
driver.findElement(By.name("money")).sendKeys("100");
driver.findElement(By.xpath("//*[@id=\"smoneyValidate_0\"]")).click();
//回到主页面
driver.switchTo().parentFrame();
//进入一个小框架
driver.switchTo().frame("leftFrame");
driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
//回到主页面
driver.switchTo().parentFrame();
//进入一个小框架
driver.switchTo().frame("mainFrame");
//打印信息
String w=driver.findElement(By.xpath("/html/body/center/table")).getText();
System.out.println(w);
}
}
