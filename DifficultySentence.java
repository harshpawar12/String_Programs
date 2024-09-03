package StringMostImp;

import java.util.Scanner;

public class DifficultySentence {
/*
 * Example
Input:
S = "Difficulty of sentence"
Output:
13

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Strimg:");
		String str=sc.nextLine();
		String s1[]=str.split(" ");
		int l=0,b=0;
		for(int i=0;i<s1.length;i++)
		{
			int c=0,k=0;
			for(int j=0;j<s1[i].length();j++)
			{
				if(s1[i].charAt(j)=='a'||s1[i].charAt(j)=='o'||
						s1[i].charAt(j)=='e'||s1[i].charAt(j)=='i'||
						s1[i].charAt(j)=='u')
				{
					c++;
				}
				else
				{
					k++;
				}
			}
			if(k>c)
			{
				l++;
			}
			else
			{
				b++;
			}
		}
		System.out.println((5*l)+(3*b));
		

	}

}
