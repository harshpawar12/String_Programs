package StringMostImp;

import java.util.Scanner;

/*
 * Q1. Reverse the vowels only (Flipkart)
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.

 */
public class ReverseVowel {
	
	ReverseVowel()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int ind=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||
					ch[i]=='o'||ch[i]=='u')
			{
				ch1[ind++]=ch[i];
			}
		}
		ind--;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||
					ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=ch1[ind--];
			}
		}
		System.out.println("The Output is:");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseVowel h=new ReverseVowel();

	}

}
