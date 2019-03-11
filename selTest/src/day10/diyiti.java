package day10;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class diyiti {
	
	static WebDriver dr;
	static String ur1;
	@BeforeClass //ÿ�����Է�������֮ǰ����
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		 dr=new ChromeDriver();
		ur1="http://localhost:8080/Banksys_ssh/";
	}
	
	/*
	 * 1,����ַ
	 * 2�������û���
	 * 3����������
	 * 4�������¼
	 */
	@Test
	public void login() throws InterruptedException  {
		dr.get(ur1);
		
		//�����û���
		WebElement input1=dr.findElement(By.name("userNO"));
		input1.sendKeys("1545636202907");	
		//��������
		WebElement input2=dr.findElement(By.name("password"));
		input2.sendKeys("123456");		
		//�����¼��ť
		dr.findElement(By.id("loginValidate_0")).click();
		Thread.sleep(1000);
	}
	@Test //ȡ��
	@Parameters("data1")
	public void qukuan1(String data1) throws InterruptedException {
		//��ת��߿�ܣ�����˵�
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		//��ת���ұ߿��
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		/**��һ�Σ���������С�����֣��ٴ�ӡ������Ϣ��*/
		dr.findElement(By.name("money")).sendKeys(data1);		
		dr.findElement(By.id("fmoneyValidate_0")).click();
		Thread.sleep(1000);
	
		//���������Ϣ
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		Thread.sleep(1000);	
	
		//��ӡ������Ϣ
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		String w=dr.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(w);
		Thread.sleep(1000);
	}
		/**�ڶ��Σ���������������֣���ӡ������ʾ��
		 * @throws InterruptedException */
	@Test
	public void qukuan2() throws InterruptedException {
		//�����Ҫȡ��
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		//����ȡ���� 
		dr.switchTo().parentFrame();
		dr.switchTo().frame("mainFrame");
		//����10000
		dr.findElement(By.name("money")).sendKeys("10000");		
		dr.findElement(By.id("fmoneyValidate_0")).click();
		Thread.sleep(1000);
		//��ӡ������Ϣ
		String y=dr.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(y);
	}

	
	@AfterClass //ÿ�����Է�������֮������
	public static void after(){
		dr.switchTo().parentFrame();
		dr.switchTo().frame("leftFrame");
		dr.findElement(By.xpath("/html/body/p[7]/a/img")).click();
		
		dr.findElement(By.xpath("/html/body/center/a")).click();
	}

}