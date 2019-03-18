package wuziqi;

import java.util.Scanner;

public class No5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1;
	    int i=0;
		Scanner a=new Scanner(System.in);
		   a=new Scanner(System.in);
		a1=a.nextInt();
		if(a1<99999&a1>0) {
			while(a1!=0) {
				i=i+1;
				a1=a1/10;
			}
			System.out.print(i);
		}
		else {
			System.out.print("请输入1~99999范围内的数");
		}
	}

}
