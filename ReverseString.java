package StringPractice;

import java.util.Scanner;

public class ReverseString {
	
	void string()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in String:");
		String str=sc.next();
		sc.close();
		String s1="";
	
		for(int i=str.length()-1;i>=0;i--)
		{
			s1+=str.charAt(i);
			
		}
		if(s1.equals(str))
		{
			System.out.println("pellindrom Character:");
		}
		else
		{
			System.out.println("not pellindrom Character");
		}
		
	System.out.println(s1);// Reverse
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString R=new ReverseString();
		R.string();

	}

}
