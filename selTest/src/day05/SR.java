package day05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SR {
	@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/frame.html");
	driver.switchTo().frame("frame");
	WebElement input=driver.findElement(By.id("input1"));
	input.sendKeys("15345345");
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	String input1=driver.findElement(By.id("id1")).getText();
	System.out.println(input1);
	}
}
