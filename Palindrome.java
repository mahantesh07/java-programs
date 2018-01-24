/*
 * given string is palindrome or not
 * 
 */
package pgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.next();
		boolean res=pali(s1);
		System.out.println(res?"is palindrome":"is not palindrome");
	}

	private static boolean pali(String s1) {
		int n=s1.length();
		char ch[]=s1.toCharArray();
		for(int i=0;i<n/2;i++)
		{
			if(ch[i]!=ch[n-1-i])
				return false;
		}
		return true;
	}

}
