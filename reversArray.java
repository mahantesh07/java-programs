package pgm;

import java.util.Scanner;

public class reversArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		reverseArray(a);
		
	}

	private static void reverseArray(int[] a) {
		int n=a.length;
		for(int i=0;i<n/2;i++)
		{
		/*	int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;*/
			a[i]=a[i]+a[n-1-i];
			a[n-1-i]=a[i]-a[n-1-i];
			a[i]=a[i]-a[n-1-i];
			/*a[i]=a[i]*a[n-1-i];
			a[n-1-i]=a[i]/a[n-1-i];
			a[i]=a[i]*a[n-1-i];*/
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
