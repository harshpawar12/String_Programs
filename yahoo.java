package StringMostImp;

import java.util.Scanner;

public class yahoo {
/*
 * Q9. Change the string (yahoo)
Input:

S = "abCD"
Output: abcd
Explanation: The first letter (a) is
lowercase. Hence, the complete string
is made lowercase.

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
	
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(0)))
			{
				System.out.println(str.toUpperCase());
				break;
			}
			if(Character.isLowerCase(str.charAt(0)))
			{
				System.out.println(str.toLowerCase());
				break;
			}
		}
		

	}

}
