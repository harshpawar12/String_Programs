package StringPractice;

import java.util.Scanner;
/*
 * Write a Java program to compare 
 * two strings using equalignore case.

 */
public class equvalIgnoreCase {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the  first String:");
		String str=sc.next();
		System.out.println("Enetr the  second String:");
		String str1=sc.next();
		if(str.equalsIgnoreCase(str1))
		{
			System.out.println("The ingonored the case and check its equval");
		}
		else
		{
			System.out.println("That ignored and the not equval:");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equvalIgnoreCase e=new equvalIgnoreCase();
		e.String();

	}

}
