package pgm;
import java.util.Scanner;
public class RevOfEachWord 
{
	private static String revOfWords(String str)
	{
		String res=" ";
		char ch[]=str.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++)
		{
			int start=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int end=i-1;
			while(end>=start)
			{
				res=res+ch[end];
				end--;
			}
			res=res+" ";
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		String str1=revOfWords(str);
		System.out.println(str1);
	}

	
}
