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
		//�л���Сҳ����ȥ
		//�����л���ʽ
		//��һ�֣������У�ֱ��д��frame��ǩ��id��name
		//driver.switchTo().frame("aa");
		//�ڶ��ַ�ʽ������
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("user")).sendKeys("test");
		//���ص���ҳ�棬���ַ�ʽ
		//���ص�����ҳ��
	    //��ҳ��---iframe---iframe
		//driver.switchTo().parentFrame();
		//ֱ�����������
		/*
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("user")).sendKeys("test");
		*/
		    //��ͼ
		    /*
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(jietu,new File("D:\\test.png"));
		 */
		//���µ�ҳǩ
		 /*
		  * 
		  * 1����indexҳ��
		  * 2�����wait��ť
		  * 3����ӡwait��ť�·�����
		  */
		 /*
		driver.findElement(By.className("wait")).click();
		Thread.sleep(1000);
		String aa=driver.findElement(By.className("red")).getText();
		System.out.println(aa);
		*/
		/*
		 * 1.����indexҳ��
		 * 2���ҵ������
		 * 3������Ҽ�
		 */
		    /*
		WebElement input=driver.findElement(By.id("user"));
		Actions ac=new Actions(driver);
		*/
		//ac.contextClick(input).perform();
		//ac.contextClick().perform();
		
		/*
		 * 1.����indexҳ��
		 * 2.�ҵ�wait��ť
		 * 3.���˫��
		 * 4.��ӡ���ֵ��ı�
		 */
		/*
		WebElement wait=driver.findElement(By.className("wait"));
				Actions a1=new Actions(driver);
				a1.doubleClick(wait).perform();
				*/
		
				/*
				 * 1.����indexҳ��
				 * 2.��λ��action��ť
				 * 3.������ƶ����ð�ť��
				 */
		WebElement a2=driver.findElement(By.className("over"));
		Actions a22=new Actions(driver);
		a22.moveToElement(a2).perform();
		String h=driver.findElement(By.id("over")).getText();
		System.out.println(h);
		}
}
