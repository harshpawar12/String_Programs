package StringPractice;

import java.util.Scanner;

public class wordFirstCapital {

	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string:");
		String s=sc.nextLine();
		
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			char ch=s1[i].charAt(0);
			String k=String.valueOf(ch).toUpperCase();
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
