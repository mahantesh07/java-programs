/*
 * finding bigest element in
 * 
biggest element in diagonal
biggest element in upper triangle
biggest element in lower triangle
 * in matrix
 * 
 */

package pgm;

import java.util.Scanner;

public class big {

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
		int ubig=a[0][1];
		int dbig=a[0][0];
		int lbig=a[1][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if (i==j) 
				{
					if (dbig<a[i][j]) 
					{
						dbig=a[i][j];
					}
				} 
				else if(i>j)
				{
					if (lbig<a[i][j]) 
					{
						lbig=a[i][j];
					}
				}
				else if(i<j)
				{
					if (ubig<a[i][j]) 
					{
						ubig=a[i][j];
					}
				}
			}
		}
		System.out.println("biggest element in diagonal="+dbig);
		System.out.println("biggest element in upper triangle="+ubig);
		System.out.println("biggest element in lower triangle="+lbig);
		

	}

}
