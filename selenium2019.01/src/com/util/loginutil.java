package com.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginutil {

	public static WebDriver driver;
	public static String url;
@BeforeClass
public void a1() throws MalformedURLException {
	
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	
	/*DesiredCapabilities a=DesiredCapabilities.chrome();
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.64.1:4444/hub"),a);
	*/
	url="http://localhost:8080/examsys/login.thtml";


}
@AfterClass   //¹Ø±Õ
public void a4() {
	driver.quit();
}
}
