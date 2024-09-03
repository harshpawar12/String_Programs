package String;

import java.util.Scanner;

public class Revword {
	
	Revword()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		
		String s1[]=str.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revword r=new Revword();
		

	}

}
