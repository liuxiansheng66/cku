package com.tiku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tiku01 extends loginutil{
//点击题库管理，点击新增题库
	public void tiku_gl() {
		//跳转到框架
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		  
	}
	//题库名称输入
	public void tk() {
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("小学第一题");
	}
	//选择状态
	public void zt() {
		WebElement a=driver.findElement(By.name("d_status"));
	Select a1=new Select(a);
	a1.selectByVisibleText("开放");
	}
	//
	public void tksm() {
		driver.findElement(By.name("d_remark")).sendKeys("请快点做出来");
	}
	//点击提交按钮
	public void tijiao() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
}
	//获取提交成功提示
	public void cg() {
		//获取新增成功信息
		String cg=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div[1]")).getText();
	System.out.println(cg);
	}
}
