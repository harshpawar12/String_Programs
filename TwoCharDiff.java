package StringMostImp;

import java.util.Scanner;

/*
 * Example 1:
Input:
S = "socks"

Output: 3

 */
public class TwoCharDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					c++;
				}
				else
				{
					break;
				}
			}
			if(c>max)
			{
				max=c;
			}
		}
		System.out.println(max);

	}

}
