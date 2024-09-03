package StringPractice;

import java.util.Scanner;

public class EndWithStartWith {
	
	void strinf()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s=sc.next();
		
		System.out.println(s.startsWith("h")+":Start with 'h' :"+s);
		System.out.println(s.endsWith("ing")+":ends with 'ing': "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EndWithStartWith s=new EndWithStartWith();
		s.strinf();

	}

}
