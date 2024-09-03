package String;

import java.util.Arrays;
import java.util.Scanner;

public class vowelReverse {
	vowelReverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Strimg:");
		String str=sc.next();
		
		
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int ind=0;

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch1[ind]=ch[i];
				ind++;
				
			}
		}
		//System.out.println(Arrays.toString(ch1));
		ind--;
		System.out.println(ind);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=ch1[ind--];
			//	System.out.println(ind);
				
			}
			
		}
		String s3=new String(ch);
		System.out.println(s3);
		
		
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		vowelReverse v=new vowelReverse();
		
	}

}
