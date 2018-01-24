/*
 * 
 * remove duplicates elemnts in the array
 * 
 */
package pgm;

import java.util.Scanner;

public class duplicates {

	public static void duplicate(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					int k=j;
					while(k<n-1)
					{
						a[k]=a[k+1];
						k++;
					}
					j--;
					n--;
				}
			}
		}
			for(int i=0;i<n;i++)
				{
					System.out.println(a[i]);
			}

		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		duplicate(a);

	}

}
