package pgm;

import java.util.Scanner;

public class ConNumToWords {

	static String[] one= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","nighty"};
	static String[] two= {"","one","two","three","four","five","six","seven","eight","nine","ten","Eleven",
			"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static void print(int num,String str)
	{
		if(num<=19)
		{
		System.out.print(two[num]);
		}
		else
		{
			System.out.print(one[num/10]+""+two[num%10]);
		}
		if (num>0)
		{
		System.out.print(str);	
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		print(num/10000000,"crore ");
		print((num/100000)%100,"lakh ");
		print((num/1000)%100,"thousand ");
		print((num/100)%10,"hundred ");
		print(num%100,"");
	}

}
