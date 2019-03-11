package day06;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bd {
	@Test
	public void open() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.baidu.com");
	//НиЭМ
	/*
	WebElement input=driver.findElement(By.id("kw"));
	Actions ac=new Actions(driver);
	ac.contextClick(input).perform();
	File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(jietu,new File("D:\\t.png"));
	 */
	
	  WebElement a1=driver.findElement(By.className("bri")); 
	Actions a2=new Actions(driver);
	a2.moveToElement(a1).perform();
	driver.findElement(By.id("lg")).click();
	}
}
