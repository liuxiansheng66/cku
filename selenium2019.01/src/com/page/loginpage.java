package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

//用户名 
	public class loginpage extends loginutil {
		//打开网址
		public void lourl() {
			driver.get(url);
		}
		//用户名输入
		public void setusername() {
			driver.findElement(By.name("username")).sendKeys("hujianming");
		}
		//密码输入
        public void setpassword() {
        	driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		}
        public void selects() throws InterruptedException {
        	WebElement s=driver.findElement(By.name("usertype"));
        	Select s1=new Select(s);
        	s1.selectByVisibleText("管理员");
        	}
      //点击登录
        public void clicklogin() {
        	driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
        }
        
        }

