package com.tiku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tiku01 extends loginutil{
//�������������������
	public void tiku_gl() {
		//��ת�����
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		  
	}
	//�����������
	public void tk() {
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("Сѧ��һ��");
	}
	//ѡ��״̬
	public void zt() {
		WebElement a=driver.findElement(By.name("d_status"));
	Select a1=new Select(a);
	a1.selectByVisibleText("����");
	}
	//
	public void tksm() {
		driver.findElement(By.name("d_remark")).sendKeys("����������");
	}
	//����ύ��ť
	public void tijiao() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
}
	//��ȡ�ύ�ɹ���ʾ
	public void cg() {
		//��ȡ�����ɹ���Ϣ
		String cg=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div[1]")).getText();
	System.out.println(cg);
	}
}
