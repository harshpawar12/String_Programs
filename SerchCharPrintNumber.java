package StringPractice;

import java.util.Scanner;

public class SerchCharPrintNumber {
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		System.out.println("Enter the perticular character:");
		char ch=sc.next().charAt(0);
		System.out.println("the index of elemt");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerchCharPrintNumber s=new SerchCharPrintNumber();
		s.String();

	}

}
