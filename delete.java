/*
 * 
 * deleting array element
 * 
 */

package pgm;

import java.util.Scanner;

public class delete {

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
		System.out.println("position:");
		int pos=sc.nextInt();
		int[] res=delete(a,pos);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

	private static int[] delete(int[] a, int pos) {
		int nar[]=new int[a.length-1];
		for(int i=0;i<pos;i++)
		{
			nar[i]=a[i];
		}
		for(int i=pos;i<nar.length;i++)
		{
			nar[i]=a[i+1];
		}
		return nar;
		
	}

}
