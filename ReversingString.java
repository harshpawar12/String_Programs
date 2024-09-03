package String;

import java.util.Scanner;

public class ReversingString {
	
	ReversingString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the String:");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		int x=ch.length-1;
		for(int i=0;i<ch.length/2;i++)
		{
		char t=ch[i];
		ch[i]=ch[x];
		ch[x]=t;
		x--;
			
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method s tub 
 		ReversingString s=new ReversingString();

	}

}
