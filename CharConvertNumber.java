package String;

import java.util.Scanner;

/*
 * Given a number N, the task is to convert
 *  every digit of the number into words.

Examples: 

Input: N = 1234 
Output: One Two Three Four

 */
public class CharConvertNumber {
	CharConvertNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number:");
		String str=sc.next();
	
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch (ch)
			{
			case '1':
				System.out.print("one"+" ");
				break;

			case '2':
				System.out.print("two"+" ");
				break;

			case '3':
				System.out.print("three"+" ");
				break;

			case '4':
				System.out.print("four"+" ");
				break;

				
			}
		}
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharConvertNumber n=new CharConvertNumber();

	}

}
