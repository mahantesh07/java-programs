/*
enter the string:
i/p:mah2ntesh sad2anaNd hire34math
o/p:mahntesh2 sadanaNd2 hiremath7 
 * 
 */

package pgm;

import java.util.Scanner;
 
public class Count2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String str=countToChar(s1);
		System.out.println(str);
	}

	private static String countToChar(String s1) {
		char[] ch=s1.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122)
					res=res+ch[i];
				else if(ch[i]>=45&&ch[i]<=57)
					count=count+(ch[i]-48);
				i++;
			}
			res=res+count+" ";
		}
		return res;
	}

}