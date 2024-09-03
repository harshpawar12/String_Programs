package String;

import java.util.Scanner;

public class RevEvenIndex {
	
	RevEvenIndex()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.nextLine();
		String s1[]=str.split(" ");
		String str1="";
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{
				for(int k=s1[i].length()-1;k>=0;k--)
				{
					System.out.print(s1[i].charAt(k));
				}
			}
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
		System.out.println("odd index element reverse:");
		for(int i=0;i<s1.length;i++)
		{
			if(i%2!=0)
			{
				for(int k=s1[i].length()-1;k>=0;k--)
				{
					System.out.print(s1[i].charAt(k));
				}
			}
			else
			{
				System.out.print(s1[i]+" ");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevEvenIndex r=new RevEvenIndex();

	}

}
