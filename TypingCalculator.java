package String;

import java.util.Scanner;

public class TypingCalculator {
	
	TypingCalculator()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='c')
			{
				System.out.print("2");
			}
			else if(ch[i]>='d' && ch[i]<='f')
			{
				System.out.print("3");
			}
			else if(ch[i]>='g' && ch[i]<='i')
			{
				System.out.print("4");
			}
			else if(ch[i]>='j' && ch[i]<='l')
			{
				System.out.print("5");
			}
			else if(ch[i]>='m' && ch[i]<='o')
			{
				System.out.print("6");
			}
			else if(ch[i]>='p' && ch[i]<='s')
			{
				System.out.print("7");
			}
			else if(ch[i]>='t' && ch[i]<='v')
			{
				System.out.print("8");
			}
			else if(ch[i]>='w' && ch[i]<='z')
			{
				System.out.print("9");
			}
		
		}
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypingCalculator f=new TypingCalculator();

	}

}
