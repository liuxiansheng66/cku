package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class csozuo {
@Test

	public void open() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url="file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/index.html";
	driver.get(url);
	
	WebElement input=driver.findElement(By.id("user"));
	input.sendKeys("�ؼ�����");
	
	WebElement s=driver.findElement(By.id("moreSelect"));
	Select s1=new Select(s);
	//��һ�ַ�ʽ������������ѡ����һ��ѡ������ݴ�0��ʼ
	//s1.selectByIndex(3);
	//�ڶ��ַ�ʽ��by value
	//s1.selectByValue("xiaomi");
	//�����ַ�ʽ��ͨ���ɼ���ֵ
	//s1.selectByVisibleText("huawei");
	
	/*
	  WebElement r1=driver.findElement(By.className("Saab"));
	  //System.out.println(r1.isSelected());
	r1.click();
	System.out.println(r1.isSelected());
	
	WebElement c1=driver.findElement(By.name("checkbox1"));
	//�����ťû�б�ѡ����ô��ѡ����
	if(!c1.isSelected()) {
	c1.click();
	}
	WebElement c2=driver.findElement(By.name("checkbox2"));
	c2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	System.out.println(b1.isEnabled());//�ж��Ƿ����

	//���Alert��ť
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	Thread.sleep(1000);
	//���������ת������������
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("prompt"));
	co1.click();
	Alert cl1=driver.switchTo().alert(); 
	Thread.sleep(1000);
	cl1.dismiss();
	Thread.sleep(1000);
	cl1.accept();//ȷ��
	//cl1.dismiss();//ȡ��
	
	WebElement pp1=driver.findElement(By.className("prompt"));
	pp1.click();
	Alert p2=driver.switchTo().alert();
	Thread.sleep(1000);
	p2.sendKeys("�Ǻ�");
	Thread.sleep(1000);
	p2.accept();
	Thread.sleep(1000);
	p2.accept();
	*/
//�����ļ���·��
	String lu="E:\\˧������.pptx";
	WebElement up=driver.findElement(By.id("load"));
	up.sendKeys(lu);
}
}
