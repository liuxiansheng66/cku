package day5;

public class Fangfa2 {

	public static int jc(int a,int b){
		// TODO Auto-generated method stub
		int a1,a2;
		int c=1;
		if(a%1==0){
			for(int i=1;i<=a;i++)
			{
				c*=i;
			}
		}
		else {
			jc(a,b);
		}
		return c;
	}
	public static void main(String[] args) {
		
		
	}
}
