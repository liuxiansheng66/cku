package day03;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xz {
@Test
public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/autotest.html");
		WebElement input1=driver.findElement(By.id("accountID"));
		input1.sendKeys("À²À²À²À²");
		WebElement input2=driver.findElement(By.id("passwordID"));
		input2.sendKeys("123456");
		WebElement x=driver.findElement(By.id("areaID"));
		Select x1=new Select(x);
		x1.selectByIndex(2);
		WebElement g=driver.findElement(By.id("sexID2"));
		g.click();
		WebElement xia=driver.findElement(By.id("u2"));
		xia.click();
		WebElement qiu=driver.findElement(By.id("u3"));
		qiu.click();
		WebElement dong=driver.findElement(By.id("u4"));
		dong.click();
		String wj="E:\\Ë§ÆøÈçÎÒ.pptx";
		WebElement a=driver.findElement(By.name("file"));
		a.sendKeys(wj);
		WebElement su=driver.findElement(By.id("buttonID"));
		Thread.sleep(2000);
		su.click();
		Alert su1=driver.switchTo().alert();
		Thread.sleep(2000);
		su1.accept();
	}
}
