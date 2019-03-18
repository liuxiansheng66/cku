package wuziqi;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,5,3,9};
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					a=arr[j];
					arr[j]=arr[j+1];
				    arr[j+1]=a;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}

}
