package String;

import java.util.Scanner;

public class HarshQ2 {
	
	HarshQ2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String s1="Geeks For Geeks";
		
		String s2[]=s1.split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i].charAt(0)+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarshQ2 h=new HarshQ2();

	}

}
