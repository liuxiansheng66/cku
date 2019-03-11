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
	input.sendKeys("控件操作");
	
	WebElement s=driver.findElement(By.id("moreSelect"));
	Select s1=new Select(s);
	//第一种方式，按照索引来选，第一个选择的内容从0开始
	//s1.selectByIndex(3);
	//第二种方式，by value
	//s1.selectByValue("xiaomi");
	//第三种方式，通过可见的值
	//s1.selectByVisibleText("huawei");
	
	/*
	  WebElement r1=driver.findElement(By.className("Saab"));
	  //System.out.println(r1.isSelected());
	r1.click();
	System.out.println(r1.isSelected());
	
	WebElement c1=driver.findElement(By.name("checkbox1"));
	//如果按钮没有被选择，那么就选择他
	if(!c1.isSelected()) {
	c1.click();
	}
	WebElement c2=driver.findElement(By.name("checkbox2"));
	c2.click();
	
	WebElement b1=driver.findElement(By.name("buttonhtml"));
	System.out.println(b1.isEnabled());//判断是否可用

	//点击Alert按钮
	WebElement a1=driver.findElement(By.className("alert"));
	a1.click();
	Thread.sleep(1000);
	//从浏览器跳转到弹出框上面
	Alert alert=driver.switchTo().alert();
	Thread.sleep(1000);
	alert.accept();
	
	WebElement co1=driver.findElement(By.className("prompt"));
	co1.click();
	Alert cl1=driver.switchTo().alert(); 
	Thread.sleep(1000);
	cl1.dismiss();
	Thread.sleep(1000);
	cl1.accept();//确定
	//cl1.dismiss();//取消
	
	WebElement pp1=driver.findElement(By.className("prompt"));
	pp1.click();
	Alert p2=driver.switchTo().alert();
	Thread.sleep(1000);
	p2.sendKeys("呵呵");
	Thread.sleep(1000);
	p2.accept();
	Thread.sleep(1000);
	p2.accept();
	*/
//定义文件的路径
	String lu="E:\\帅气如我.pptx";
	WebElement up=driver.findElement(By.id("load"));
	up.sendKeys(lu);
}
}
