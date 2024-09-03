package String;

import java.util.Scanner;

/*
 * Write a Java program to create a new string repeating every character twice of a 
given string.
Sample Output:
The given string is: welcome
The new string is: wweellccoomme
 */
public class welcomeTwice {
	welcomeTwice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		System.out.println("Printing the twice String:");
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i!=ch.length-1)
			{
				System.out.print(ch[i]+""+ch[i]);
			}
			else
			{
				System.out.println(ch[i]+"");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeTwice w=new welcomeTwice();

	}

}
