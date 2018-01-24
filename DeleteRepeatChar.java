/*
 * 
 * delete the repeated character in the string
 * 
 */
package pgm;

import java.util.Scanner;

public class DeleteRepeatChar {

	public static void delete(String str)
	{
		char[] ch=str.toCharArray();
		int n=ch.length;
		for (int i = 0; i < n; i++)
		{
			for (int j =i+1; j < n; j++)
			{
				if(ch[i]==ch[j])
				{
					int k=j;
					while (k<n-1) 
					{
						ch[k]=ch[k+1];
						k++;
					}
					j--;
					n--;
				}
			}
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String:");
		String str=sc.nextLine();
		delete(str);

	}

}
