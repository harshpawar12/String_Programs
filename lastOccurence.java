package StringMostImp;

import java.util.Scanner;

public class lastOccurence {
/*
 * string A.
Example 1:
Input:
A = abcdefghijklwghifghsd
B = ghi
Output:
13

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		
		
		System.out.println(str.lastIndexOf("ghi"));
		

	}

}
