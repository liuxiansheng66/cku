package day5;

import java.util.Scanner;

public class Fangfa {

	/*public static void printRect() {
		// TODO Auto-generated method stub
System.out.println("********");
	}*/
	//�в������޷���ֵ�ķ���
	/*public static void printRest(int width,int height) {
		// TODO Auto-generated method stub
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}*/
	//�в������з���ֵ
	//���ܣ��������������
	/*public static int Ma(int a,int b) {
		int s;
		s=a*b;
		return s;
	}
	public static int add2(int a,int b,int c) {
		int s;
		s=a*b*c;
		return s;
	}*/
	//���������أ��������ֿ���һ����
	//
	//�������Ͳ�һ��
	//������һ��
	/*public static int add(int a,int b) {
		int s;
		s=a+b;
		return s;
	}
	public static int add(int a,int b,int c) {
		int s;
		s=a*b*c;
		return s;
	}
	public static double add(double a,double b,double c) {
		double s;
		s=a+b+c;
		return s;
	}*/
	/*public static int jc(int a) {
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b*=i;
		}
		return b;
	}*/
	public static int s1(int a,int b) {
		int s=1;
	s=a+b;
	return s;
	}
	public static int s2(int a,int b) {
		int s=1;
	s=a-b;
	return s;
	}
	public static int s3(int a,int b) {
		int s=1;
	s=a*b;
	return s;
	}
	public static double s4(double a,double b) {
		double s=1.0;
		if(b==0) {
			/*int a1,a2;
			System.out.println("����������");
			Scanner e=new Scanner(System.in);
			   e=new Scanner(System.in);
			a1=e.nextInt();
			Scanner d=new Scanner(System.in);
			   d=new Scanner(System.in);
			a2=d.nextInt();
			s4(a,b);*/ //��������ѭ��
		}else {
	s=a/b;
		}
		return s;
	}
public static void main(String[] args) {
	//printRect();
	/*printRest(10,2);
	System.out.println();
	printRest(12,3);*/
	//System.out.println(Ma(5,6));
	//System.out.println(add2(4,5,6));
	/*System.out.println(add(5,6));
	System.out.println(add(1.5,6.5,7.5));
	System.out.println(add(5,6,7));*/
	/*
	int a1;
	Scanner a=new Scanner(System.in);
	   a=new Scanner(System.in);
	a1=b.nextInt();
	System.out.println(jc(a1));
	*/
	int b1,a1,a2;
	System.out.println("��ѡ��1.�ӷ�\n2.����\n3.�˷�\n4.����");
	Scanner c=new Scanner(System.in);
	   c=new Scanner(System.in);
	b1=c.nextInt();
if(b1<4)
{
	Scanner a=new Scanner(System.in);
	   a=new Scanner(System.in);
	a1=a.nextInt();
	Scanner b=new Scanner(System.in);
	   b=new Scanner(System.in);
	a2=a.nextInt();
switch(b1) {
case 1:
	System.out.println("�ӷ�"+s1(a1,a2));
	break;
case 2:
	System.out.println("����"+s2(a1,a2));
	break;
case 3:
	System.out.println("�˷�"+s3(a1,a2));
	break;
case 4:
	System.out.println("����"+s4(a1,a2));
	break;
}
}
else {
	System.out.println("����������");
}
}
}
