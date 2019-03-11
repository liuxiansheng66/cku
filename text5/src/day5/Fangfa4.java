package day5;

public class Fangfa4 {

      static int getMax(int[] arr) {
int max=arr[0];
for(int x=1;x<arr.length;x++)
{
	if(arr[x]>max) {
		max=arr[x];
	}
}
	return max;

	}
public static void main(String[] args) {
		int[]arr1= {43,64,65,75,23};
		System.out.println("×î´óÖµ£º"+getMax(arr1));
		
	}
	
	
}
