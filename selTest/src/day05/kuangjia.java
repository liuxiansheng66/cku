package day05;

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

public class kuangjia {
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		@Test
		public void open() throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		    driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/index.html");
		//切换到小页面中去
		//两种切换方式
		//第一种：括号中，直接写上frame标签的id或name
		//driver.switchTo().frame("aa");
		//第二种方式：索引
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("user")).sendKeys("test");
		//跳回到主页面，两种方式
		//跳回到父类页面
	    //主页面---iframe---iframe
		//driver.switchTo().parentFrame();
		//直接跳到最外层
		/*
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");
		*/
		    //截图
		    /*
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(jietu,new File("D:\\test.png"));
		 */
		//打开新的页签
		 /*
		  * 
		  * 1，打开index页面
		  * 2，点击wait按钮
		  * 3，打印wait按钮下方的字
		  */
		 /*
		driver.findElement(By.className("wait")).click();
		Thread.sleep(1000);
		String aa=driver.findElement(By.className("red")).getText();
		System.out.println(aa);
		*/
		/*
		 * 1.进入index页面
		 * 2，找到输入框
		 * 3，点击右键
		 */
		    /*
		WebElement input=driver.findElement(By.id("user"));
		Actions ac=new Actions(driver);
		*/
		//ac.contextClick(input).perform();
		//ac.contextClick().perform();
		
		/*
		 * 1.进入index页面
		 * 2.找到wait按钮
		 * 3.点击双击
		 * 4.打印出现的文本
		 */
		/*
		WebElement wait=driver.findElement(By.className("wait"));
				Actions a1=new Actions(driver);
				a1.doubleClick(wait).perform();
				*/
		
				/*
				 * 1.进入index页面
				 * 2.定位到action按钮
				 * 3.把鼠标移动到该按钮上
				 */
		WebElement a2=driver.findElement(By.className("over"));
		Actions a22=new Actions(driver);
		a22.moveToElement(a2).perform();
		String h=driver.findElement(By.id("over")).getText();
		System.out.println(h);
		}
}
