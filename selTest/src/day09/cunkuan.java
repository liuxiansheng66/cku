package day09;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cunkuan {
@Test
public void ck() throws InterruptedException {
    //�ùȸ�
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//������ַ
	driver.get("http://localhost:8080/Banksys_ssh/");
	//��¼
	driver.findElement(By.name("userNO")).sendKeys("1545633089692");
	driver.findElement(By.name("password")).sendKeys("123456");
	Thread.sleep(1500);
driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();
//����С���
driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/p[2]/a")).click();
//�ص���ҳ��
driver.switchTo().parentFrame();
//������һ��С���
driver.switchTo().frame("mainFrame");
//���
driver.findElement(By.name("money")).sendKeys("100");
driver.findElement(By.xpath("//*[@id=\"smoneyValidate_0\"]")).click();
//�ص���ҳ��
driver.switchTo().parentFrame();
//����һ��С���
driver.switchTo().frame("leftFrame");
driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
//�ص���ҳ��
driver.switchTo().parentFrame();
//����һ��С���
driver.switchTo().frame("mainFrame");
//��ӡ��Ϣ
String w=driver.findElement(By.xpath("/html/body/center/table")).getText();
System.out.println(w);
}
}
