package pgm;

import java.util.Scanner;

public class bubbleSort {

	public static int[] sort(int[] a)
	{
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
		
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=sort(a);
		//sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
