package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicallyLarge {
/*
 * Example 1:
Input:
N = 3
strings = a , ab , abc
Output: a abc
Explanation: Lexicographically smallest is
"a" and lexicographically largest is
"abc".

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String size:");
		int size=sc.nextInt();
		String s[]=new String[size];
		
		System.out.println("Enetr the element:");
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
			
		}
	//	Arrays.sort(s);
		System.out.println(s[0]);
		System.out.println(s[s.length-1]);
		
	}

}
