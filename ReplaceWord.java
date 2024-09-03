package StringMostImp;

import java.util.Scanner;

public class ReplaceWord {
/*
 * Example 1:
Input:
S = "xxforxx xx for xx"
oldW = "xx"
newW = "Geeks"
Output:
"geeksforgeeks geeks for geeks"

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		
		System.out.println(str.replace("xx","Geeks"));

	}

}
