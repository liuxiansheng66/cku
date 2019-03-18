

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baidu01 {

	public static WebDriver driver;
	public static String url;
@BeforeClass
public void a1() throws MalformedURLException {
	
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	
	/*DesiredCapabilities a=DesiredCapabilities.chrome();
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.64.1:4444/hub"),a);
	*/
	url="https:www.baidu.com";

}
@Test
public void baidu() {
	driver.get(url);
}
@AfterClass   //¹Ø±Õ
public void a4() {
	//driver.quit();
}
}