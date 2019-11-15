package maxmin;
import java.util.Scanner;
public class Array1{	
	public static void main(String[] args)
	{
		Scanner o = new Scanner(System.in);
	try
	{
		System.out.println("Enter number of elements in your array");
		int n;
		n=o.nextInt();
		System.out.println("start enter");
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=o.nextInt();
		}
		int max=array[0];
		int min=array[0];
		for (int j=0;j<n/2;j++)
		{
			if(array[j*1]>array[j*1+1])
			{
				if(array[j*1]>max)
				{
							max=array[j*1];
				}
				if(array[j*1+1]<min)
				{
							min=array[j*1+1];
				}
			}
			else if(array[j*1]==array[j*1+1])
			{
				if(array[j*1]>max)
				{
					max=array[j*1];
				}
				if(array[j*1]<min)
				{
					min=array[j*1];
				}
			}
			else
			{
				if(array[j*1+1]>max)
				{
					max=array[j*1+1];
				}
				if(array[j*1]<min)
				{
					min=array[j*1];
				}
			}
			
		}
		if(array[n-1]>max)
		{
			max=array[n-1];
		}
		if(array[n-1]<min)
		{
			min=array[n-1];
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
	}
		finally
		{
			o.close();
		}
	}	
}
