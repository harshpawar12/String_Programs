package String;

import java.util.Arrays;

/*
 * Q1. Reverse the vowels only (Flipkart)
 S ="practice"
 Output: prectica
 Explanation: The vowels are a, i, e
 Reverse of these is e, i, a.
 */
public class StringQ {
	
	public void isvowel()
	{
		String s="practice";
		char ch[]=s.toCharArray();
		char ch1[]=new char[8];
		int x=0;
		String st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i')
			{
				ch1[x++]=ch[i];
			}
				
		}
		
		x--;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i')
			{
				ch[i]=ch1[x--];
			}
		}
	
			
		for(int i=0;i<ch.length;i++)
		{
			st+=ch[i];
		}
		
		System.out.println(st);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringQ s=new StringQ();
		s.isvowel();

	}

}
