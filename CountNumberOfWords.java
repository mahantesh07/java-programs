/*
 * 
 * count the number of words in string
 */
package pgm;

import java.util.Scanner;

public class CountNumberOfWords
{
	private static int numOfWords(String str)
	{
		int count=1;
		char ch[]=str.toCharArray();
		if(ch[0]==' ')
		{
			count=0;
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ' &&ch[i+1]!=' ')
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		int space=numOfWords(str);
		System.out.println(space);
	}

	

}
