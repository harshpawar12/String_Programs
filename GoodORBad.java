package StringMostImp;

import java.util.Scanner;

public class GoodORBad {
/*
 * Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more than
3 consonants or more than 5 vowels together. So,
it's a GOOD string.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		int c=0,k=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='u'||str.charAt(i)=='o')
			{
				c++;
			}
			else
			{
				k++;
			}
		}
		if(c>=5 && k<=3)
		{
			System.out.println("good String"+c);
		}
		else
		{
			System.out.println("Bad String"+k);
		}

	}

}
