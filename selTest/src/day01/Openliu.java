package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu{
@Test
public void open() throws InterruptedException{
	//�򿪻�������
	//System.setProperty("webdriver.firfox.bin", "F:\\���\\firefox.exe");
	//WebDriver driver=new FirefoxDriver();
	
	//�򿪹ȸ������
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//����ַ
	String url1="http://localhost:8080/mobile_mysql/index.jsp";
	driver.get(url1);
	/*String url2="https.www.163.com";
	driver.get(url2);
	*/
	/*
	driver.get("http://www.baidu.com");
	driver.manage().window().maximize();
	//����ҳ��
	driver.navigate().back();
	//�������
	driver.manage().window().maximize();
	
	//�����������С
	Dimension dimension = new Dimension(900, 800);
	driver.manage().window().setSize(dimension);
	
	//ˢ��ҳ��
	driver.navigate().refresh();
	//ִ�����u��ҳ��ص��ٶ�
	//��ӡ����
	String title1=driver.getTitle();
	System.out.println(title1);
	String title2=driver.getTitle();
	System.out.println(title2);
	//��ӡ��ǰ����ַ
	driver.getCurrentUrl();
	
	//��ȡ��ǰҳ��Title�����⣩
	driver.getTitle();
	
	Thread.sleep(1000);
	
	//�����ǰ��
	driver.navigate().forward();
	*/
	
	//.sendkey("selenium");
	/*WebElement input=driver.findElement(By.id("wrapper"));
	input.sendKeys("selement");
	WebElement buton=driver.findElement(By.id("ftCon"));
	buton.sendKeys("ftCon");*/
	
	
	//driver.findElement(By.linkText("����")).click();;
	//buton.click();
	//driver.findElement(By.linkText("ϰ��ƽ�͹�����Լ��")).click();
/*int a=driver.findElements(By.linkText("a")).size();
System.out.println(a);*/
	/*WebElement input=driver.findElement(By.xpath("//news.baidu.com/z/resource/pc_index_banner/pcconf.js?1544428207432"));
	Thread.sleep(5000);*/
	WebElement input=driver.findElement(By.name("name"));
	input.sendKeys("��˧��");
	WebElement input1=driver.findElement(By.name("password"));
	input1.sendKeys("123456");
	WebElement input2=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input"));
    input2.click();
}
}