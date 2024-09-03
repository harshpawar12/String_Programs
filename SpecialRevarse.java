package StringMostImp;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Example 2:
Input: S = "A&x#
Output: "x&A#"

 */
public class SpecialRevarse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j]))
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(ch));

	}

}
