package StringPractice;

import java.util.Scanner;

public class CharAtMethod {
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s=sc.next();
		System.out.println("Using char At method..");
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharAtMethod c=new CharAtMethod();
		c.String();

	}

}
