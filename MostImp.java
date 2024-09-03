package String;

import java.util.Scanner;

public class MostImp {
	
	MostImp()
	{
		System.out.println("Enetr the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int startCap=65; // 
		int endCap=90;
		int fcp=97;
		int lcap=122;
		System.out.println();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
			int currentChar=str.charAt(i);
			int diff=currentChar-startCap;
			int Expected=endCap-diff;
			System.out.print((char)Expected);
			}
			if(Character.isLowerCase(str.charAt(i)))
			{
				int currentChar=str.charAt(i);
				int diff=currentChar-fcp;
				int Expected=lcap-diff;
				System.out.print((char)Expected);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostImp h=new MostImp();

	}

}
