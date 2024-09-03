package StringPractice;

import java.util.Scanner;

public class ConcatMethod {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String:");
		String s=sc.next();
		System.out.println("Enetr the second String:");
		String s1=sc.next();
		s=s1.concat(s);
		System.out.println("Concating");
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatMethod c=new ConcatMethod();
		c.String();

	}

}
