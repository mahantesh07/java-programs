/*
 * finding bigest element in column of the matrix
 * 
 */
package pgm;

import java.util.Scanner;

public class BigEleCol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("row value:");
		int row=sc.nextInt();
		System.out.println("col value:");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("enter the array elements:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the array elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		for(int i=0;i<a.length;i++)
		{
			int max=a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[j][i])
				{
					max=a[j][i];
				}
			}
			System.out.println("max="+max);
		}

	}

}
