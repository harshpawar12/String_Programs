package StringPractice;

import java.util.Scanner;

public class SerchElementString {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		System.out.println("Enetr the elemnt u Serched");
		char ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				System.out.println("Element are present");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerchElementString s=new SerchElementString();
		s.String();

	}

}
