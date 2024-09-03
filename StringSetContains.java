package String;

import java.util.Scanner;

public class StringSetContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String");
		String str=sc.nextLine();
		System.out.println("Enetr the second String:");
		String str1=sc.next();
		if(str.contains(str1))
		{
			System.out.println("First String are present in second");
			
		}
		else
		{
			System.out.println("Second String not present in first");
		}

	}

}
