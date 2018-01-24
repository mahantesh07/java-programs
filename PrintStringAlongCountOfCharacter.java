package pgm;

import java.util.Scanner;

public class PrintStringAlongCountOfCharacter {

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
				count++;
				res=res+ch[i];
				i++;
			}
			res=res+count;
		}
		return res;
	}

}
