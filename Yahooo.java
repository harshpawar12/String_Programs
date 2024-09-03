package String;

import java.util.Scanner;

public class Yahooo {
	
	Yahooo()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the string:");
	String str=sc.next();
	
	System.out.println("Complete String Lowercase:");
	for(int i=0;i<str.length();i++)
	{
		if(Character.isUpperCase(str.charAt(0)))
		{
		System.out.println(str.toUpperCase());
	
		}
		else if(Character.isLowerCase(str.charAt(0)))
		{
			System.out.println(str.toLowerCase());
			break;
	
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yahooo y=new Yahooo();
		/*
		 * Q9. Change the string (yahoo)
 Input:
S ="abCD"
 Output: abcd
 Explanation: The first letter (a) is
 lowercase. Hence, the complete string
 is made lowercase
		 */

	}

}
