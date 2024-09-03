
package String;

import java.util.Scanner;

public class Stringpro1 {
	/*
	 * .enter a string by user and search 
	 * particular element are present or not

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string:");
		String str=sc.next();
		System.out.println("eneter the element:");
		char ch=sc.next().charAt(0);
	int	c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				c++;
			}
			
		}
		if(c!=0)
		{
			System.out.println("Element are present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
	}

}
