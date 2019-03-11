package day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class denglu {

@Test
	public void open() throws InterruptedException {
	Thread.sleep(1000);
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.126.com/");
	WebElement input3=driver.findElement(By.xpath("//*[@id=\"lbNormal\"]"));
    input3.click();
	WebElement input=driver.findElement(By.name("email"));
	input.sendKeys("15345345");
	Thread.sleep(1000);
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("666666");
	WebElement input2=driver.findElement(By.xpath("//*[@id=\"dologin\"]"));
    input2.click();
	}
}
