package pgm;

import java.util.Scanner;

public class CountOfSubString {

	public static int subString(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int count=0;
		for (int i = 0; i < c1.length; i++)
		{
			int j=0;
			while (j<c2.length&&i<c1.length&&c1[i]==c2[j]) {
				i++;
				j++;
			}
			if (j==c2.length)
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("enter the substring");
		String sub=sc.nextLine();
		int res=subString(str, sub);
		System.out.println(res);
	}

}
