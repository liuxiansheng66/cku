package Zxks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class hanjia1 {
		static WebDriver driver;
		static String url;
	@BeforeClass
	public void qt() {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="http://flight.qunar.com";
	}
	@Test  //搜索
	public void a() {
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"js_lab_sng\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input")).click();
		WebElement s=driver.findElement(By.name("fromCity"));
		Select s1=new Select(s);
		s1.selectByVisibleText("重庆");
		driver.findElement(By.xpath("//*[@id=\"start_b\"]")).click();
		/*driver.findElement(By.name("fromCity")).sendKeys("北京");
	driver.findElement(By.name("toCity")).sendKeys("上海");
driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button")).click();

driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button")).click();
*/
	}
}