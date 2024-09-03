package StringPractice;

import java.util.Scanner;

public class VowelConsonantString {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the char in string");
		String ch=sc.next();
		int c=0,k=0;
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)=='a'||ch.charAt(i)=='e'||
			ch.charAt(i)=='e'||ch.charAt(i)=='e'
			||ch.charAt(i)=='e')
			{
				c++;
			}
			else
			{
				k++;
			}
		}
		System.out.println(c+"Vowel");
		System.out.println(k+"Consonant");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonantString V=new VowelConsonantString();
		V.String();

	}

}
