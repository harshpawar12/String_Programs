package String;

import java.util.Scanner;

public class StringEvenOddpositionally {
	/*
	 * 7.Wap enter a string and the character
	 *  present at even and odd position
	 *   individually.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string:");
		String str=sc.next();
		System.out.println("element present in even position");
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("element present in odd position");
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println(str.charAt(i));
			}
		}
		

	}

}
