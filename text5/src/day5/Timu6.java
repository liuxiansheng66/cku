package day5;

import java.util.Scanner;

public class Timu6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("现在11月14日  天蝎座");
System.out.println("天蝎座的人：我也不知道");
System.out.println("请输入自己的出生年月，即可查询自己的星座信息");
	int a1,a2,a3;
	
	Scanner a=new Scanner(System.in);
	   a=new Scanner(System.in);
	   a1=a.nextInt();
	   
	   Scanner b=new Scanner(System.in);
	   b=new Scanner(System.in);
	   a2=b.nextInt();
	   
	   Scanner c=new Scanner(System.in);
	   c=new Scanner(System.in);
	   a3=c.nextInt();
	   switch(a2) {
	   case 1:
		   if(a3<19)
		   {
			   System.out.println("摩羯座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("水瓶座：聪明帅气，人好话不多");
		   }
		   break;
	   case 2:
		   if(a3<18)
		   {
			   System.out.println("水瓶座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("双鱼座：记得买两条鱼");
		   }
		   break;
	   case 3:
		   if(a3<20)
		   {
			   System.out.println("双鱼座：记得买两条鱼");
		   }
		   else {
			   System.out.println("白羊座：养头羊吧");
		   }
		   break;
	   case 4:
		   if(a3<19)
		   {
			   System.out.println("白羊座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("金牛座：聪明帅气，人好话不多");
		   }
		   break;
	   case 5:
		   if(a3<20)
		   {
			   System.out.println("金牛座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("双子座：聪明帅气，人好话不多");
		   }
		   break;
		   
	   case 6:
		   if(a3<21)
		   {
			   System.out.println("双子座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("巨蟹座：聪明帅气，人好话不多");
		   }
		   break;
	   case 7:
		   if(a3<22)
		   {
			   System.out.println("巨蟹座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("狮子座：聪明帅气，人好话不多");
		   }
		   break;
	   case 8:
		   if(a3<22)
		   {
			   System.out.println("狮子座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("处女座：聪明帅气，人好话不多");
		   }
		   break;
	   case 9:
		   if(a3<23)
		   {
			   System.out.println("处女座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("天秤座：聪明帅气，人好话不多");
		   }
		   break;
	   case 10:
		   if(a3<23)
		   {
			   System.out.println("天秤座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("天蝎座：聪明帅气，人好话不多");
		   }
		   break;
	   case 11:
		   if(a3<24)
		   {
			   System.out.println("天蝎座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("射手座：聪明帅气，人好话不多");
		   }
		   break;
	   case 12:
		   if(a3<23)
		   {
			   System.out.println("射手座：聪明帅气，人好话不多");
		   }
		   else {
			   System.out.println("摩羯座：聪明帅气，人好话不多");
		   }
		   break;
		   
	   }
	}   
}
