package String;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  Input:
 s1 = aacdb
 s2 = gafd
 Output: cbgf

 */
public class RemoveCommonChar {
	
	RemoveCommonChar()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the first String:");
		String str=sc.next();
		System.out.println("Enetr the second String:");
		String str1=sc.next();
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		char c3[]=new char[ch.length+ch1.length];
		//System.out.println(c3);
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			int k=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					k++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0' && k!=ch[i])
			{
				System.out.println(ch[i]);
			}
		}
		
		for(int i=0;i<ch.length;i++)
		{
			c3[i]=ch[i];
			x++;
			
		}
		for(int i=0;i<ch1.length;i++)
		{
			c3[x]=ch1[i];
			x++;
			
		}
		//System.out.println(Arrays.toString(c3));
		for(int i=0;i<c3.length;i++)
		{
			int c=0;
			for(int j=i+1;j<c3.length;j++)
			{
				if(c3[i]==c3[j])
				{
					c3[i]='\0';
					
					c3[j]='\0';
				}
			}
			
		}
		for(int i=0;i<c3.length;i++)
		{
			if(c3[i]!='\0')
			{
					
					System.out.print(c3[i]+"<---- ans ");
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveCommonChar h=new RemoveCommonChar();

	}

}
