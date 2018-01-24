/*
 * 
 * insert the element in the array
 * 
 */
package pgm;

import java.util.Scanner;

public class insert {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("element to be replaced:");
		int ele=sc.nextInt();
		System.out.println("position:");
		int pos=sc.nextInt();
		int[] res=insert(a,ele,pos);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

	private static int[] insert(int[] a, int ele, int pos)
	{	
		int[] nar=new int[a.length+1];
		nar[pos]=ele;
		for(int i=0;i<pos;i++)
		{
			nar[i]=a[i];
		}
		for(int i=pos+1;i<nar.length;i++)
		{
			nar[i]=a[i-1];
		}
		return nar;
	}			
}
