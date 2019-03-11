package Zxks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class zxks {
	static WebDriver driver;
	static String url;
@BeforeClass
public void qt() {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/Exam_ssh";
}
@Test  //进入考试
public void a() {
	driver.get(url);
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
	driver.findElement(By.name("stuNumber")).sendKeys("01");
	driver.findElement(By.name("stuName")).sendKeys("aa");
	driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td/p[2]/input[1]")).click();
}
@Test(dependsOnMethods="a")//选择试卷
public void b() {
	WebElement s=driver.findElement(By.name("examType"));
	Select s1=new Select(s);
	s1.selectByIndex(2);
	driver.findElement(By.xpath("//*[@id=\"start_b\"]")).click();
}
@Test(dependsOnMethods="b")//开始答题
public void c() {
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
}
@AfterClass //
public static void after(){
	driver.close();
}
}
