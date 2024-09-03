package String;

import java.util.Scanner;

public class StringSerchChar {
	/*
	 * enter a string by user and search particular
	 *  character and print its no
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string");
		String s=sc.next();
		System.out.println("Enetr the serched character:");
		char ch=sc.next().charAt(0);
		System.out.println("the number of elemnt");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
			
				System.out.println(i);
			}
		}
		
		
		

	}

}
