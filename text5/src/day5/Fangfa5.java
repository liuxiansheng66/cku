package day5;

import java.util.Scanner;

public class Fangfa5 {

	public static void px(int[] arr) {
     int a=0;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]<arr[j+1]) {
			a=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=a;
		}
	}
	
}
	}

	public static void main(String[] args) {
    	 System.out.println("ÊäÈë");
    	 int arr[];
    	 arr=new int[10]; 
			Scanner a=new Scanner(System.in);
			   a=new Scanner(System.in);
			   for(int i=0;i<arr.length;i++) 
			   {
			   arr[i]=a.nextInt();
			   }
			   px(arr);
			   System.out.println("µ¹Ðð£º");
			   for(int j=0;j<arr.length;j++)
			   {
				  System.out.print(arr[j]+" "); 			  				   
			   }
			  
	}

}
