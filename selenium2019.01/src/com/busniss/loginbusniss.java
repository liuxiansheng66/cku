package com.busniss;

import com.page.loginpage;

public class loginbusniss extends loginpage{
	public void login() throws InterruptedException {
loginpage page=new loginpage();
page.lourl();
page.setusername();
page.setpassword();
page.selects();
//�ȴ�ʮ�룬������֤��
Thread.sleep(10000);
page.clicklogin();
	}
}
 
