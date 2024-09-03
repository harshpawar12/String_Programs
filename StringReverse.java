package String;

import java.util.Scanner;

public class StringReverse {
	/*
	 * Q13.Write a Java program to find reverse of
	 *  a string using class and object.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string");
		String str=sc.next();
		char[] ch=new char[str.length()];
		int x=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch[x++]=str.charAt(i);
			
		}
		str=new String(ch);
		System.out.println(str);

	}

}
