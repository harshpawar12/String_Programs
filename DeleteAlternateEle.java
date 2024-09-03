package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q2. Delete alternate characters (Amazon)
Input: S = "
"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.

 */
public class DeleteAlternateEle {
	
	DeleteAlternateEle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		for(int i=1;i<sb.length();i+=2)
		{
			sb.deleteCharAt(i);
			i--;
		}
		System.out.println(sb);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAlternateEle h=new DeleteAlternateEle();

	}

}
