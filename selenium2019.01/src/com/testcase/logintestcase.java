package com.testcase;

import org.eclipse.jdt.internal.compiler.util.Util;
import org.testng.annotations.Test;

import com.busniss.loginbusniss;
import com.tianjia.tianjiaBJ;
import com.tiku.tiku01;
import com.util.loginutil;
public class logintestcase extends loginutil{
	@Test
	public void utils() throws InterruptedException {
loginbusniss lo=new loginbusniss();
lo.lourl();
lo.login();
tiku01 t=new tiku01();
Thread.sleep(2000);
t.tiku_gl();
t.tk();
t.zt();
t.tksm();
t.tijiao();
Thread.sleep(2000);
t.cg();
tianjiaBJ tj=new tianjiaBJ();
Thread.sleep(2000);
tj.tiku_gl1();
Thread.sleep(2000);
tj.tk1();
tj.zt1();
tj.tksm1();
tj.tijiao1();
Thread.sleep(2000);
tj.cg1();
	}
}
