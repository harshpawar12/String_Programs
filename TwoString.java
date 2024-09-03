package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

public class TwoString {
/*
 * A = choice
B = chancE
Output: 4

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the 1st String:");
		String str=sc.next();
		System.out.println("Enetr the 2nd String:");
		String str1=sc.next();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(str1.charAt(i))) {
				c++;
			}
			
		}
		System.out.println(c);
		
	
		
	}
}
