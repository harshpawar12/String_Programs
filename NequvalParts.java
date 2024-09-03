package String;

import java.util.Scanner;

/*
 * Java Program to divide a
 *  string in 'N' equal parts.
 */
public class NequvalParts {
	
	NequvalParts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		System.out.println("Enetr the number:");
		int n=sc.nextInt();
		
		int  ch=(str.length()/n);
		if(str.length()%n!=0)
		{
			System.out.println("Split are not possible..");
		}
		else
		{
			for(int i=0;i<str.length();i=i+ch)
			{
				System.out.println(str.substring(i, i+ch));       
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NequvalParts f=new NequvalParts();

	}

}
