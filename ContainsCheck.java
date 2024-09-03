package StringPractice;

import java.util.Scanner;

public class ContainsCheck {

	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		System.out.println("Enetr the String:");
		String str1=sc.next();
		
		if(str.contains(str1))
		{
			System.out.println("contain are present");
		}
		else
		{
			System.out.println("Conatain are not present");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsCheck s=new ContainsCheck();
		s.String();

	}

}
