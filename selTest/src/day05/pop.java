package day05;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/pop.html");
	driver.findElement(By.linkText("click me")).click();
	Set<String>w=driver.getWindowHandles();
	for(String handle:w) {
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		if("百度一下，你就知道".equals(title)) {
			
			Thread.sleep(1000);
			driver.findElement(By.id("user")).sendKeys("");

		}
	}
	}
	}
