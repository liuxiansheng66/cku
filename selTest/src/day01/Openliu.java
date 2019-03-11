package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu{
@Test
public void open() throws InterruptedException{
	//打开火狐浏览器
	//System.setProperty("webdriver.firfox.bin", "F:\\火狐\\firefox.exe");
	//WebDriver driver=new FirefoxDriver();
	
	//打开谷歌浏览器
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//打开网址
	String url1="http://localhost:8080/mobile_mysql/index.jsp";
	driver.get(url1);
	/*String url2="https.www.163.com";
	driver.get(url2);
	*/
	/*
	driver.get("http://www.baidu.com");
	driver.manage().window().maximize();
	//后退页面
	driver.navigate().back();
	//窗口最大化
	driver.manage().window().maximize();
	
	//设置浏览器大小
	Dimension dimension = new Dimension(900, 800);
	driver.manage().window().setSize(dimension);
	
	//刷新页面
	driver.navigate().refresh();
	//执行完后u，页面回到百度
	//打印标题
	String title1=driver.getTitle();
	System.out.println(title1);
	String title2=driver.getTitle();
	System.out.println(title2);
	//打印当前的网址
	driver.getCurrentUrl();
	
	//获取当前页面Title（标题）
	driver.getTitle();
	
	Thread.sleep(1000);
	
	//浏览器前进
	driver.navigate().forward();
	*/
	
	//.sendkey("selenium");
	/*WebElement input=driver.findElement(By.id("wrapper"));
	input.sendKeys("selement");
	WebElement buton=driver.findElement(By.id("ftCon"));
	buton.sendKeys("ftCon");*/
	
	
	//driver.findElement(By.linkText("新闻")).click();;
	//buton.click();
	//driver.findElement(By.linkText("习近平和广西的约定")).click();
/*int a=driver.findElements(By.linkText("a")).size();
System.out.println(a);*/
	/*WebElement input=driver.findElement(By.xpath("//news.baidu.com/z/resource/pc_index_banner/pcconf.js?1544428207432"));
	Thread.sleep(5000);*/
	WebElement input=driver.findElement(By.name("name"));
	input.sendKeys("刘帅哥");
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("123456");
	WebElement input2=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
    input2.click();
}
}