package pgm;

import java.util.Scanner;

public class ReverseFLCharEachWordOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.nextLine();
		String res=revFLChar(s1);
		System.out.println("1st last char rev:\n"+res);
	}

	private static String revFLChar(String s1) {
		char[] ch=s1.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			int start=i;
			char c1=ch[start];
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int end=i-1;
			char c2=ch[end];
			ch[start]=c2;
			ch[end]=c1;
		}
		for(int i=0;i<ch.length;i++)
		{
			res=res+ch[i];
		}
		return res;
	}

}
