package String;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the string:");
		String str=sc.nextLine();
		System.out.println("Enetr the string:");
		String str1=sc.next();
		if(str.contains(str1))
		{
			System.out.println("in first string are present in second");
			
		}
		else
		{
			System.out.println("Second String are not present in String");
		}
	
		

	}

}
