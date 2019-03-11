package com.tianjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tianjiaBJ extends loginutil{
	//点击学生管理，点击班级管理
		public void tiku_gl1() {
			//跳转到最外面
			driver.switchTo().parentFrame();
			//跳转到左框架
			driver.switchTo().frame("menu");
			driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
			//跳回到最外面的框架
			driver.switchTo().parentFrame();
		}
		//班级名称输入
		public void tk1() {
			//
			driver.switchTo().frame("main");
			driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
			driver.findElement(By.name("b_name")).sendKeys("小学测试4班");
		}
		//选择状态
		public void zt1() {
			WebElement a=driver.findElement(By.name("b_status"));
		Select a1=new Select(a);
		a1.selectByVisibleText("正常");
		}
		//备注
		public void tksm1() {
			driver.findElement(By.name("b_remark")).sendKeys("小学超神班");
		}
		//点击提交按钮
		public void tijiao1() {
			driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
		//获取提交成功提示
		public void cg1() {
			//获取新增成功信息
			String cg1=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div[1]")).getText();
		System.out.println(cg1);
		}
}
