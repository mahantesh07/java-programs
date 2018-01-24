/*
 * 
 * factorial of number
 * 
 */

package pgm;
import java.util.Scanner;
public class Factorial {
	static	  int fact=1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int res=isFact(num);
		System.out.println("res="+res);
	}

	public static int isFact(int num) {
	
		if(num>1)
		{
			fact=fact*num--;
			isFact(num);
		}
		return fact;
	}

}
