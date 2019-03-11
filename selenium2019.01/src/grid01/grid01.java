package grid01;

//import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	public class grid01 {
		private WebDriver driver;
		private String url;
	@BeforeClass
	public void a1() throws Exception{
		/*
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		*/
		DesiredCapabilities a=DesiredCapabilities.chrome();
		driver=new RemoteWebDriver(new URL("http://192.168.64.1:6666/wd/hub/"),a);
		
		url="http://localhost:8080/examsys/login.thtml";
	}
	@Test
	public void a2() throws InterruptedException {
		//����ҳ
		driver.get(url);
		//�����û���
		driver.findElement(By.name("username")).sendKeys("hujianming");
		//��������
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		//ѡ�����
	WebElement s=driver.findElement(By.name("usertype"));
	Select s1=new Select(s);
	s1.selectByVisibleText("����Ա");
	//�ȴ�ʮ�룬������֤��
	Thread.sleep(10000);
	//�����¼
	driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
	}
	@Test
	public void a3() throws InterruptedException {
		//�ȴ�1��
		Thread.sleep(1000);
		//������
		driver.switchTo().frame("main");
		//��ȡ��ҳ����
		String shouye=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
		//��ӡ
		System.out.println(shouye);
	}
	@AfterClass   //�ر�
	public void a4() {
		driver.quit();
	}
	}

