/*
 * print nth max number
 * 
 */
package pgm;

import java.util.Scanner;

public class nthmax {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] a= new int[size];
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("enter the value of "+i+"position");
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		int[] nar=ascending(a);
		System.out.println("sorted array elements are:");
		for (int i = 0; i < nar.length; i++) {
			System.out.println("nar["+i+"]="+nar[i]);
		}
		System.out.println("enter which max");
		int max=sc.nextInt();
		if (max<=a.length) {
			System.out.println(nar[nar.length-max]);
		} else {
			System.out.println("invalid index");
		}
	}

	private static int[] ascending(int[] a) {
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

}
