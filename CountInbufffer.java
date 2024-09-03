package StringBuffer;

import java.util.Scanner;

/*
 * 3. Write a Java program that accepts 
 * a string as input and counts the number of 
 * occurrences of each character using the 
 * StringBuffer class. The output should display
 *  each character along with its count
 */
public class CountInbufffer {
	
	CountInbufffer()
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(sc.nextLine());
		
		for(int i=0;i<sb.length();i++)
		{
			int c=0;
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					c++;
					sb.deleteCharAt(j);					
				}
			}
			if(sb.charAt(i)!=c)
			{
				if(sb.charAt(i)!=' ')
				{
				System.out.print(sb.charAt(i)+""+c);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountInbufffer c=new CountInbufffer();
		

	}

}
