package day05;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xlj {

@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/index.html");
	driver.findElement(By.linkText("Open new window")).click();
	driver.findElement(By.linkText("Open new window")).click();
/*
 * 1.定位到新的页签
 * 2，跳转到新的页签
 */
	//获取当前页面的所有句柄，
	//当前有两个页面，所以要用集合来接收两个句柄
	Set<String>w=driver.getWindowHandles();
	//随机在句柄集合中，选择一个句柄
	for(String handle:w) {
		//跳转至该句柄的网页中
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		//通过标题判断1，所获取的页面是否是我想要的
		//如果是想要的，就对股该页面进行操作
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
			driver.findElement(By.id("user")).sendKeys("asda");
		}
	}
}
}
