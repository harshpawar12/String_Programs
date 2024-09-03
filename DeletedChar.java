package String;

import java.util.Scanner;

/*
 * Q10. 
 Delete alternate characters.
 Input: S = "Geeks"
 Output: "Ges"
 Explanation: Deleted "e" at index 1
 and "k" at index 3.

 */
public class DeletedChar {
	
	DeletedChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		StringBuffer sb=new StringBuffer(sc.next());
		System.out.println("Index one & three element deleted:");
		for(int i=0;i<sb.length()-2;i++)
		{
			sb.deleteCharAt(1);
			sb.deleteCharAt(2);
			System.out.println(sb);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletedChar d=new DeletedChar();

	}

}
