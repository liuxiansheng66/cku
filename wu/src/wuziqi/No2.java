package wuziqi;

import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int month;
		int day;
		int d = 0;
		int e;
		Scanner a=new Scanner(System.in);
		   a=new Scanner(System.in);
		year=a.nextInt();
		Scanner b=new Scanner(System.in);
		  b=new Scanner(System.in);
		month=b.nextInt();
		Scanner c=new Scanner(System.in);
		day=c.nextInt();
		switch(month) {
		case 1:
			d=0;
			break;
		case 2:
			d=31;
			break;
		case 3:
			d=59;
			break;
		case 4:
			d=90;
			break;
		case 5:
			d=120;
			break;
		case 6:
			d=151;
			break;
		case 7:
			d=181;
			break;
		case 8:
			d=212;
			break;
		case 9:
			d=243;
			break;
		case 10:
			d=273;
			break;
		case 11:
			d=304;
			break;
		case 12:
			d=334;
			break;
			
		}
		e=day+d;
	System.out.println("这是"+year+"年"+"第"+e+"天");
	}

}
