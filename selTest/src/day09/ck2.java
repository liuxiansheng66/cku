package day09;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ck2 {
	@Test(dependsOnMethods="ck")
	//详细备注在cunkuan里面有与之类似的操作步骤
	public void ck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/Banksys_ssh/");
		//登录
		driver.findElement(By.name("userNO")).sendKeys("1545633089692");
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();
	//取款
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("/html/body/p[3]/a")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame("mainFrame");
	driver.findElement(By.name("money")).sendKeys("10");
	driver.findElement(By.xpath("//*[@id=\"fmoneyValidate_0\"]")).click();
	//打印
	driver.switchTo().parentFrame();
	driver.switchTo().frame("leftFrame");
	driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame("mainFrame");
	String w=driver.findElement(By.xpath("/html/body/center/table")).getText();
	System.out.println(w);
	//第二次取款
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("/html/body/p[3]/a")).click();
	driver.switchTo().parentFrame();
	driver.switchTo().frame("mainFrame");
	driver.findElement(By.name("money")).sendKeys("1000");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id=\"fmoneyValidate_0\"]")).click();
	Thread.sleep(2000);
	String w1=driver.findElement(By.xpath("/html/body/center")).getText();
	System.out.println(w1);
	driver.findElement(By.xpath("/html/body/center/a")).click();
  }
}
