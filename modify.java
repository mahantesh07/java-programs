package pgm;

import java.util.Scanner;

public class modify {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=null;
		while(true) {
		System.out.println("enter the 1 to create array:");
		System.out.println("enter 2 for insert");
		System.out.println("enter 3 for delete");
		System.out.println("enter 4 for replace");
		System.out.println("enter 5 for display");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1:
			a=createArray();
			break;
		case 2:
			System.out.println("enter the element:");
			int ele=sc.nextInt();
			System.out.println("enter the position");
			int pos=sc.nextInt();
			a=insert(a,ele,pos);
			break;
		case 3:
			System.out.println("enter the position");
			int pos1=sc.nextInt();
			a=delete(a,pos1);
			break;
		case 4:
			System.out.println("enter the element:");
			int ele2=sc.nextInt();
			System.out.println("enter the position");
			int pos2=sc.nextInt();
			a=replace(a,ele2,pos2);
			break;
		case 5:
			display(a);
			break;
		}
	}
	}
	private static int[] insert(int[] a, int ele, int pos)
	{
		if (pos>a.length) 
		{
			System.out.println("invalid position");
			return a;
		}
		else
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

	private static int[] delete(int[] a, int pos)
	{
		if (pos>a.length)
		{
			System.out.println("invalid pos:");
			return a;
		}
		else
		{
			int[] nar=new int[a.length-1];
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

	private static int[] replace(int[] a, int ele, int pos)
	{
		if (pos>a.length)
		{
			System.out.println("invalid position");
			return a;
		} 
		else
		{
			a[pos]=ele;
			return a;
		}
	}

	public static int[] createArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
