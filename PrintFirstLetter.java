package StringMostImp;

import java.util.Scanner;

public class PrintFirstLetter {
/*
 * Input:
S = "geeks for geeks"
Output: gfg

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i].charAt(0));
		}

	}

}
