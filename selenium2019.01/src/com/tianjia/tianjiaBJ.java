package com.tianjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.util.loginutil;

public class tianjiaBJ extends loginutil{
	//���ѧ����������༶����
		public void tiku_gl1() {
			//��ת��������
			driver.switchTo().parentFrame();
			//��ת������
			driver.switchTo().frame("menu");
			driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
			driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
			//���ص�������Ŀ��
			driver.switchTo().parentFrame();
		}
		//�༶��������
		public void tk1() {
			//
			driver.switchTo().frame("main");
			driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
			driver.findElement(By.name("b_name")).sendKeys("Сѧ����4��");
		}
		//ѡ��״̬
		public void zt1() {
			WebElement a=driver.findElement(By.name("b_status"));
		Select a1=new Select(a);
		a1.selectByVisibleText("����");
		}
		//��ע
		public void tksm1() {
			driver.findElement(By.name("b_remark")).sendKeys("Сѧ�����");
		}
		//����ύ��ť
		public void tijiao1() {
			driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
		//��ȡ�ύ�ɹ���ʾ
		public void cg1() {
			//��ȡ�����ɹ���Ϣ
			String cg1=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/div[1]")).getText();
		System.out.println(cg1);
		}
}
