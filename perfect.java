/*
 * 
 * 
 * check given number is perfect number or not
 */
package pgm;

import java.util.Scanner;

public class perfect{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		isPerfect(num);
	}

	private static boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("perfect no");
			return true;
		}
		else
		{
			System.out.println("not perfect no");
			return false;
		}
	}

}
