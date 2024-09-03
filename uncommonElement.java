package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

public class uncommonElement {
/*
 * Input:
A = geeksforgeeks
B = geeksquiz
Output: fioqruz

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the 1st String:");
		String str=sc.next();
		System.out.println("Enter the 2nd String:");
		String str2=sc.next();
		char ch[]=str.toCharArray();
		char ch1[]=str2.toCharArray();
		char ch3[]=new char[ch.length+ch1.length];
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			ch3[i]=ch[i];
			c++;
		}
		for(int i=0;i<ch1.length;i++)
		{
			ch3[c]=ch1[i];
			c++;
		}
		//System.out.println(Arrays.toString(ch3));
		for(int i=0;i<ch3.length;i++)
		{
			int k=0;
			for(int j=i+1;j<ch3.length;j++)
			{
				if(ch3[i]==ch3[j])
				{
					k++;
					
					ch3[j]='\0';
				}
			}
			if(ch3[i]!='\0'&& k==0)
			{
				System.out.print(ch3[i]);
			}
			
		}
		
		

	}

}
