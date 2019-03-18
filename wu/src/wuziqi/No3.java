package wuziqi;

import java.util.Scanner;

public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa;
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		   a=new Scanner(System.in);
		aa=a.nextInt();
		int i=0;
		if(aa!=0) {
			while(aa!=0) {
				i=aa%10;
				System.out.print(i);
				aa=aa/10;
			}
			}
	else {
			System.out.print(i);
		}
	}
	}

