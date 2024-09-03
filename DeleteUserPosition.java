package StringPractice;

import java.util.Scanner;

public class DeleteUserPosition {
	
	void String()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elemnt in string:");
		String s=sc.next();
		System.out.println("Enetr the position to delete number:");
		int p=sc.nextInt();
		String a="";
		int val=0;
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(i)!=p)
				{
					System.out.println(i);
				}
		}
		
		
	}
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		DeleteUserPosition g=new DeleteUserPosition();
		g.String();

	}

}
