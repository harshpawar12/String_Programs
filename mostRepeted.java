package String;

import java.util.Scanner;

/*
 * ava Program to find the most repeated 
 * word in a given string
 */
public class mostRepeted {
	
	mostRepeted()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the String:");
	String str=sc.next();
	char ch[]=str.toCharArray();
	char max=0,min=(char)Integer.MIN_VALUE;
	char c=1;char mexele=0,minele=0;
		for(int i=0;i<ch.length;i++)
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
			if(c>max)
			{
				max=c;
				mexele=ch[i];
			}
			else if(c<min)
			{
				min=c;
				minele=ch[i];
			}
		}
		System.out.println(mexele);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostRepeted h=new mostRepeted();

	}

}
