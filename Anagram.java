package pgm;

import java.util.Scanner;

public class Anagram {

	public static String removeSpace(String s1)
	{
		String res="";
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i]!=' ')
			{
				res=res+ch[i];
			}
		}
		return res;
	}
	public static String SortString(String s1)
	{
		String res="";
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length-1; i++)
		{
			for (int j =i+1; j < ch.length; j++)
			{
				if (ch[i]>ch[j])
				{
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
			res=res+ch[i];
		}
		return res;
	}
	public static String toUpperCase(String s1)
	{
		String res="";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			res=res+ch[i];
		}
		return res;
		
	}
	public static boolean compare(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for (int i = 0; i < c1.length; i++)
		{
			if (c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		System.out.println("enter the second string");
		String s2=sc.nextLine();
		
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		
		System.out.println("two strings after removing space are:");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		if (s1.length()!=s2.length())
		{
			System.out.println("it is not an anagram");
		}
		else
		{
			s1=toUpperCase(s1);
			s2=toUpperCase(s2);
			System.out.println("the string after converting are:");
			System.out.println("s1="+s1);
			System.out.println("s2="+s2);
			
			s1=SortString(s1);
			s2=SortString(s2);
			System.out.println("the string after sorting are:");
			System.out.println("s1="+s1);
			System.out.println("s2="+s2);
			
			boolean res=compare(s1, s2);
			System.out.println(res?"its an anagram":"not anagram");
			
		}
	}

}
