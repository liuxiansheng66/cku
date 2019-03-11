package Zxksxt;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class zxksqt {
	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/Exam_ssh";
}
@Test   //登录
public void denglu() {
driver.get(url);
driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
driver.findElement(By.name("name")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/p[2]/input[1]")).click();
	}
@Test(dependsOnMethods="denglu")
//添加考试类型
	public void tj() {
driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
driver.findElement(By.name("testName")).sendKeys("a1");
driver.findElement(By.name("testTime")).sendKeys("2");
driver.findElement(By.xpath("//*[@id=\"table4\"]/tbody/tr/td[1]/div/input")).click();
	}
	@Test(dependsOnMethods="tj")//添加试题
	public void tjshiti() {
driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
driver.findElement(By.id("title")).sendKeys("阿斯蒂芬");
WebElement s=driver.findElement(By.id("examType"));
Select s1=new Select(s);
s1.selectByIndex(2);
WebElement ss=driver.findElement(By.id("score"));
Select ss1=new Select(ss);
ss1.selectByIndex(3);
WebElement aa=driver.findElement(By.id("level"));
Select aa1=new Select(aa);
aa1.selectByIndex(1);
WebElement b=driver.findElement(By.id("note"));
Select b1=new Select(aa);
b1.selectByIndex(0);
driver.findElement(By.name("choices")).sendKeys("sdfgh");
driver.findElement(By.name("standardAnswer")).sendKeys("dfg");
driver.findElement(By.xpath("//*[@id=\"table4\"]/tbody/tr/td[1]/div/input")).click();
	}
	@Test(dependsOnMethods="tjshiti")//浏览试题并打印
	public void liulan() {
driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
String w=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table")).getText();
System.out.println(w);
	}
@Test(dependsOnMethods="liulan")//添加学生
public void tjstudent() {
driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
driver.findElement(By.name("id")).sendKeys("1");
driver.findElement(By.name("realname")).sendKeys("sd");
driver.findElement(By.name("stuNumber")).sendKeys("233434");
driver.findElement(By.name("className")).sendKeys("3434");
driver.findElement(By.name("address")).sendKeys("南昌");
driver.findElement(By.name("phone")).sendKeys("137668533");
driver.findElement(By.name("email")).sendKeys("@ghgd");
driver.findElement(By.name("humanId")).sendKeys("234567765432");
driver.findElement(By.xpath("//*[@id=\"table14\"]/tbody/tr/td[1]/div/input")).click();
	}
	@Test(dependsOnMethods="tjstudent")//浏览全部学生并打印
	public void liulanstudnet() {
driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
String w1=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table")).getText();
System.out.println(w1);
}
	@AfterClass //
	public static void after(){
		driver.close();
	}
}