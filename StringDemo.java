package String;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="harsh";
		System.out.println(str);
		str=str.concat("pawar");// the concat using we can attach
							//Two string
		str=str.toUpperCase();// maked in Uppercase.
		System.out.println(str);
		str=str.toLowerCase(); // maked in lowercase.
		System.out.println(str);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Character enter the user:");
		int n1=sc.nextInt();
		char ch=str.charAt(n1);
		System.out.println("printing the user given index position number");
		System.out.println(ch);
		System.out.println("Single characters in String:");
		
		for(int i=0;i<str.length();i++)
		{
			
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("length of the string");
		System.out.println(str.length());
		

		
		

		
		
		

	}

}
