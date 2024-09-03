package StringMostImp;

import java.util.Scanner;

public class microsoftQue {
	/*
	 * Q4. Front-Back Transformation - copy (Microsoft)
Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are
replaced by their respective upper or lower case
letters accordingly.

	 */
	microsoftQue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str1=sc.next();
		
		char  firstcap=65;
		char lastcap=90;
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isUpperCase(str1.charAt(i)))
			{
			int curent=str1.charAt(i);
			int diff=curent-firstcap;
			int output=lastcap-diff;
			System.out.println((char)output);
			}
		}
		char ch1=97;
		char ch2=122;
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isLowerCase(str1.charAt(i)))
			{
				int curr=str1.charAt(i);
				int diff=curr-ch1;
				int output=ch2-diff;
				System.out.print((char)output);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		microsoftQue g=new microsoftQue();

	}

}
