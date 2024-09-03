package String;

import java.util.Scanner;

public class keypadTypePro {
	
	keypadTypePro()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='c')
			{
				System.out.print("2");
			}
			else if(ch[i]>='d' && ch[i]<='f')
			{
				System.out.print("3");
			}
			else if(ch[i]>='g' && ch[i]<='i')
			{
				System.out.print("4");
			}
			else if(ch[i]>='j' && ch[i]<='l')
			{
				System.out.print("5");
			}
			else if(ch[i]>='m' && ch[i]<='o')
			{
				System.out.print("6");
			}
			else if(ch[i]>='p' && ch[i]<='s')
			{
				System.out.print("7");
			}
			else if(ch[i]>='t' && ch[i]<='v')
			{
				System.out.print("8");
			}
			else if(ch[i]>='w' && ch[i]<='z')
			{
				System.out.print("9");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypadTypePro h=new keypadTypePro();
		/*
		 * S = geeksforgeeks
Output: 4335736743357

Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.

       2=abc 3=def
4=ghi  5=jkl 6=mno
7=pqrs 8=tuv 9 wxyz


		 */

	}

}
