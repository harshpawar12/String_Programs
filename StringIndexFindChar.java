package String;

import java.util.Scanner;

public class StringIndexFindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the string:");
		String str=sc.next();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
	System.out.println(str.indexOf(ch));//first index.
//	System.out.println(str.lastIndexOf(ch));//Last index.

		
	

	}

}
