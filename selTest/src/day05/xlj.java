package day05;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xlj {

@Test
	public void open() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/%E5%AD%A6%E4%B9%A0/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/java/%E7%BD%91%E9%A1%B5/index.html");
	driver.findElement(By.linkText("Open new window")).click();
	driver.findElement(By.linkText("Open new window")).click();
/*
 * 1.��λ���µ�ҳǩ
 * 2����ת���µ�ҳǩ
 */
	//��ȡ��ǰҳ������о����
	//��ǰ������ҳ�棬����Ҫ�ü����������������
	Set<String>w=driver.getWindowHandles();
	//����ھ�������У�ѡ��һ�����
	for(String handle:w) {
		//��ת���þ������ҳ��
		driver.switchTo().window(handle);
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		//ͨ�������ж�1������ȡ��ҳ���Ƿ�������Ҫ��
		//�������Ҫ�ģ��ͶԹɸ�ҳ����в���
		if("UIAutomation iFrame".equals(title)) {
			Thread.sleep(2000);
			driver.findElement(By.id("user")).sendKeys("asda");
		}
	}
}
}
