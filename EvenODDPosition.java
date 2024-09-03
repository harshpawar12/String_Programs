package StringPractice;

import java.util.Scanner;

public class EvenODDPosition {

	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in string:");
		String str=sc.next();
		System.out.println("Even index and Elements:");
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" index "+str.charAt(i));
			}
		}
		System.out.println("Even index and Elements:");
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" index "+str.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenODDPosition E=new EvenODDPosition();
		E.String();

	}

}
