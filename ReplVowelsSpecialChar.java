package pgm;

import java.util.Scanner;

public class ReplVowelsSpecialChar {

	public static String vowels(String str)
	{
		String res="";
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'a':
				res=res+'$';
				break;
			case 'e':
				res=res+'&';
				break;
			case 'i':
				res=res+'*';
				break;
			case 'o':
				res=res+'/';
				break;
			case 'u':
				res=res+'#';
				break;
			default:
				res=res+ch[i];
			}
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		String res=vowels(str);
		System.out.println(res);
	}

}
