package day07;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class shuangji {

	@Test
	public void open() throws InterruptedException, IOException, AWTException {
	//System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	//driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/dragAndDrop.html");
	//双击
	//WebElement f=driver.findElement(By.id("drag"));
	//Actions s=new Actions(driver);
	//s.doubleClick(f).perform();
	/*
	 * 拖动红色方块
	 */
	/*
	  WebElement f=driver.findElement(By.id("drag"));
	WebElement mubiao=driver.findElement(By.xpath("/html/body/h1"));
	Actions s=new Actions(driver);
	s.clickAndHold(f).moveToElement(mubiao).release(f).perform();
	*/
	//拖动到指定位置
	/*
	WebElement f=driver.findElement(By.id("drag"));
	Actions s=new Actions(driver);
	s.dragAndDropBy(f, -180, -30).perform();
	*/
	/*
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/index.html");
	WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
List<WebElement>option=select.findElements(By.tagName("option"));
	Actions s=new Actions(driver);
	//select.sendKeys(Keys.CONTROL);
	s.keyDown(Keys.CONTROL)
	//.click(option.get(1))
	.click(option.get(2))
	.perform();
	*/
	/*
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/dragAndDrop02.html");
	WebElement f=driver.findElement(By.id("drag"));
	Actions s=new Actions(driver);
	s.dragAndDropBy(f, -180, -100).perform();
	*/
	/*
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/%E9%A1%B5%E9%9D%A2/index.html");
	WebElement b=driver.findElement(By.id("user"));
	Robot aa=new Robot();
	Thread.sleep(2000);
	//点击Ctrl
	aa.keyPress(KeyEvent.VK_CONTROL);
	//点击s
	aa.keyPress(KeyEvent.VK_S);
	//放开s
	aa.keyRelease(KeyEvent.VK_S);
	//放开Ctrl
	aa.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	aa.keyPress(KeyEvent.VK_ESCAPE);
	*/
	/*
	Robot aa=new Robot();
	aa.keyPress(KeyEvent.VK_CONTROL);
	aa.keyPress(KeyEvent.VK_ALT);
	aa.keyPress(KeyEvent.VK_S);
	aa.keyRelease(KeyEvent.VK_S);
	aa.keyRelease(KeyEvent.VK_ALT);
	aa.keyRelease(KeyEvent.VK_CONTROL);
	*/
	/*
	 * 目录
	 */
	//FileHandler.createDir(new File("f:\\data1"));
	FileHandler.copy(new File("f:\\data"), new File("f:\\data1"),"个人简历.docx");	
	
	}
}
