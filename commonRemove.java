package StringMostImp;

import java.util.Scanner;

public class commonRemove {
	
	/*
	 * Input:
s1 = aacdb
s2 = gafd
Output: cbgf

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the 1st String:");
		String str=sc.next();
		System.out.println("Enetr the 2nd String:");
		String str1=sc.next();
		
		str=str1.concat(str);
		System.out.println(str);
		
		char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		int c=0;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
			c++;
			ch[j]='\0';
			
			}
			
		}
		if(ch[i]!='\0' && c==0)
		{
			System.out.print(ch[i]+"");
		}
		
	}
		

	}

}
