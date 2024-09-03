package String;

import java.util.Scanner;

/*
 * Java program to find the duplicate 
 * characters in a string
 */
public class DuplicateChar {
	
	DuplicateChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String");
		String str=sc.next();
		System.out.println("----Duplicate char-----");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateChar n=new DuplicateChar();

	}

}
