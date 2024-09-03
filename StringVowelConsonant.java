package String;

import java.util.Scanner;

public class StringVowelConsonant {
	/*
	 * 5.enter a string and count the no
	 *  of vowel and consonent.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string:");
		String str=sc.next();
		//char ch=sc.next().charAt(0);
		int c=0;
		int d=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				c++;
				
			}
			else
			{
				d++;
			}
		}
		System.out.println(c+"vowel");
		System.out.println(d+"consonant");
		

	}

}
